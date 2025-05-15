/*
 * É possível substituir mas somente se estiver fora da event dispatch thread.
 * No código apresentado dentro do TestaThread.java já está sendo usando o SwingUtilities.invokeAndWait
 * 
 * Brevemente a diferença é que o invokeLater programa o código para ser executado
 * futuramente e o invokeAndWait basicamente espera o código ser executado antes de continuar
 */