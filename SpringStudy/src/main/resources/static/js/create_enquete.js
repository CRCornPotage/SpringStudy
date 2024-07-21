$(function(){
	
	/** 設問追加ボタン処理 */
	$('.add_question').click(function (){
		
		// ドキュメント内の設問要素を取得
		let question_nodes = document.getElementsByClassName('question');
		let questions = Array.from(question_nodes);
		
		// ログ出力
		console.log('run add_question');
		
		// イベント数
		let question_count = questions.length;
		
		// 追加するhtml
		let question_value = `
		<div class="question">
			<h3>Question ${question_count + 1}</h3>
			<input type="text" id="createQuestionForms1.questionName" name="createQuestionForms[${question_count}].questionName" value="" />
			
			<div class="select">
				<h4>Select 1</h4>
				<input type="text" id="createQuestionForms1.createSelectForms0.selectName" name="createQuestionForms[${question_count}].createSelectForms[0].selectName" value="" />
			</div>
			<div class="del_select_button">
				<button class="del_select">削除</button>
			</div>
		
			<div class="select">
				<h4>Select 2</h4>
				<input type="text" id="createQuestionForms1.createSelectForms1.selectName" name="createQuestionForms[${question_count}].createSelectForms[1].selectName" value="" />
			</div>
			<div class="del_select_button">
				<button class="del_select">削除</button>
			</div>
			
			<div class="add_select_button">
				<button class="add_select">選択肢追加</button>
			</div>
		</div>
		<div class="del_question_button">
			<button ="del_question">設問削除</button>
		</div>`;
		
		// 設問数を出力(デバック)
		console.log('question count : ' + question_count);
		
		// htmlを設問追加ボタンの上に追加
		$('.add_question_button').before(question_value);
		
	});
	
	/** 設問削除ボタン処理 */
	$('.del_question').click(function (){
		
		// ログ出力
		console.log('run del_question');
		
		// 設問削除
		$(this).closest('.question').remove();
		
	});
	
});