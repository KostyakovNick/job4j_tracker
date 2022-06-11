package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу модели банковской системы:
 * Регистроция пользователя.
 * Удаление пользователя из системы.
 * Добавление пользователю банковский счет. У пользователя системы могут быть несколько счетов.
 * Перевод денег с одного банковского счета на другой счет.
 */
public class BankService {

    /**
     * Хранение задания осуществляется в коллекции типа Map поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя, с пустым счетом
     * @param user пользователь которого добавляем
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет банковский счет пользователю
     * @param passport паспорт пользователя банка
     * @param account счет, который добавляем пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> rsl = users.get(user);
            if (!rsl.contains(account)) {
                rsl.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя по паспорту
     * @param passport - паспорт пользователя банка
     * @return возвращает пользователя банка или null, если такой пользователь отсутствует
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод осуществляет поиск банковского счета по паспорту пользователя банка и реквизитам счета
     * @param passport паспорт пользователя банка
     * @param requisite реквизиты банковского счета
     * @return возращает банковский счет или null, если такой счет отсутствует
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит деньги с одного счета на другой
     * @param srcPassport паспорт пользователя отправителя
     * @param srcRequisite реквизиты счета пользователя отправителя
     * @param destPassport паспорт пользователя получателя
     * @param destRequisite реквизиты счета пользователя получателя
     * @param amount количество денег для перевода
     * @return возвращает true, если операция прошла успешно или false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}