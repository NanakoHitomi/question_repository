<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <title>アンケートフォーム - 確認</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/NewFile.css">
</head>
<body>
    <h1>確認画面</h1>
    <p>以下の情報で送信します。よろしいですか？</p>

    <p><strong>お名前:</strong> ${name}</p>
    <p><strong>メールアドレス:</strong> ${email}</p>
    <p><strong>ご意見・ご感想:</strong><br>${feedback}</p>

    <form action="confirm" method="post">
        <input type="hidden" name="name" value="${name}">
        <input type="hidden" name="email" value="${email}">
        <input type="hidden" name="feedback" value="${feedback}">
        <input type="submit" value="送信">
        <input type="button" value="戻る" onclick="history.back()">
    </form>
</body>
</html>