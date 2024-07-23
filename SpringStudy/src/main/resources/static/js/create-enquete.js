$(function(){
	
	/** 設問追加ボタン処理 */
	$('.add-question').click(function (){
		
		// ドキュメント内の設問要素を取得
		let questionNodes = document.getElementsByClassName('question');
		let questions = Array.from(questionNodes);
		
		// ログ出力
		console.log('run add-question');
		
		// イベント数
		let questionCount = questions.length;
		
		// 追加するhtml
		let questionValue = `
		<div class="question">
			<h3>Question ${questionCount + 1}</h3>
			<input type="text" id="createQuestionForms1.questionName" name="createQuestionForms[${questionCount}].questionName" value="" />
			
			<div class="select">
				<h4>Select 1</h4>
				<input type="text" id="createQuestionForms1.createSelectForms0.selectName" name="createQuestionForms[${questionCount}].createSelectForms[0].selectName" value="" />
			</div>
			<div class="del-select-button">
				<button class="del-select">削除</button>
			</div>
		
			<div class="select">
				<h4>Select 2</h4>
				<input type="text" id="createQuestionForms1.createSelectForms1.selectName" name="createQuestionForms[${questionCount}].createSelectForms[1].selectName" value="" />
			</div>
			<div class="del-select-button">
				<button class="del-select">削除</button>
			</div>
			
			<div class="add-select-button">
				<button class="add-select">選択肢追加</button>
			</div>
		</div>
		<div class="del-question-button">
			<button ="del-question">設問削除</button>
		</div>`;
		
		// 設問数を出力(デバック)
		console.log('question count : ' + questionCount);
		
		// htmlを設問追加ボタンの上に追加
		$('.add-question-button').before(questionValue);
		
	});
	
	/** 設問削除ボタン処理 */
	$('.del-question').click(function (){
		
		// ログ出力
		console.log('run del-question');
		
		// 設問削除
		$(this).closest('.question').remove();
		
	});
	
});