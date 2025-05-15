/*
 * Ela não precisa de invokeLater porque é executada dentro do runnable.
 * Ele garante que o código vai ser executado no event dispatch thread
 * então qualquer código já vai ser executado de forma segura
 */