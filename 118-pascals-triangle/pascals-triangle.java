class Solution {
    public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            row.add(1);

            if (i > 0) {

                List<Integer> previousRow = result.get(i - 1);

                for (int j = 1; j < previousRow.size(); j++) {

                    int value = previousRow.get(j - 1) + previousRow.get(j);

                    row.add(value);
                }
            }
            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
   
    }
}