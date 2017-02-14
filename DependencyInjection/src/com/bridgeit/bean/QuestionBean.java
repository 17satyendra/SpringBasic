package com.bridgeit.bean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author bridgeit Satyendra Singh. This class contains three properties, one
 *         constructors and displayInfo() method that prints the information.
 *         Here, we are using List to contain the multiple answers.
 */
public class QuestionBean {
	private int id;
	private String name;
	//private Set<AnswerBean>/*List<String>*/ answers;
	//private Map<String, String> answers;
	
	private Map<AnswerBean, UserBean> answers;
	
	public QuestionBean(int id, String name, /*List<String>
				Set<AnswerBean>Map<String, String>*/Map<AnswerBean, UserBean>  answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("Answers are: ");
		
		/*Iterator<String> it = answers.iterator();
		 */
		/*Iterator<AnswerBean> it = answers.iterator();
		*/
		
		/*Set<Entry<String, String>> set=answers.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		*/
		
		Set<Entry<AnswerBean, UserBean>> set=answers.entrySet();
		Iterator<Entry<AnswerBean, UserBean>> itr = set.iterator();
		
		while (itr.hasNext()) {
			/*Entry<String, String> entry= itr.next();
			System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
			*/
			
			Entry<AnswerBean, UserBean> entry= itr.next();
			
			AnswerBean ans = entry.getKey();
			UserBean user = entry.getValue();
			
			System.out.println("Answer Information");
			System.out.println(ans);
			
			System.out.println("posted By");
			System.out.println(user);
			
		}
	}
}
