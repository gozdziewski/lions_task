public String[] wordsFront(String[] words, int n) {
    String[] new_array = new String[n];
    for (int i = 0; i < new_array.length; i++) {
      new_array[i] = words[i];
    }
    return new_array;
}