        const feedbackTextarea = document.getElementById("feedback");
        const charCountElement = document.getElementById("char-count");

        feedbackTextarea.addEventListener("input", function() {
            const text = feedbackTextarea.value;
            const count = text.length;
            charCountElement.textContent = count + " 文字";
        });



     