<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <title>アンケートフォーム</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/NewFile.css">
    <script src="./js/script.js" async></script>
</head>
<body>
    <h1>アンケートフォーム</h1>
    <form action="questionnaire" method="post">
        <label for="name">お名前:</label>
        <input type="text" id="name" name="name" required><br> 

        <label for="email">メールアドレス:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="feedback" id="aaaa">ご意見・ご感想:</label><br>
        <textarea id="feedback" name="feedback" rows="4" cols="50" required></textarea><br>
        <span id="char-count">0 文字</span>
        
        

        <input type="submit" value="送信">
    </form>
    
    
</body>
</html>