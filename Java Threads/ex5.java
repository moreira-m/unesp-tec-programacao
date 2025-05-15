/*
 * pBar.setValue(cont++) precisa usar SwingUtilities.invokeLater() porque está
 * sendo chamada em uma thread que não é event dispatch thread
 */