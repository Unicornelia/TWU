# Assignment

**Download the biblioteca.sqlite database and use sqlite3 to answer the following questions:**

1. Who checked out the book 'The Hobbit’?
2. How many people have not checked out anything?
3. What books and movies aren't checked out?
4. Add the book 'The Pragmatic Programmer', and add yourself as a member.
5. Check out 'The Pragmatic Programmer'.
6. Use your query from question 1 to verify that you have checked it out.
7. Also, provide the SQL used to update the database.
8. Who has checked out more that 1 item?
9. Tip: Research the GROUP BY syntax.

# Answers

## Steps taken:

```
sqlite3 biblioteca.sqlite
```
1.

```
sqlite> .schema
sqlite> select * from book where title = "The Hobbit";
sqlite> select * from checkout_item  where book_id  = 5;
sqlite> select member_id from checkout_item where book_id  = 5;
sqlite> select * from member where id = 1;
```
2.


* solution.sql
* solution.txt

### Rest of the files => Learn SQL the hard way tasks
- Chapter 1-7
