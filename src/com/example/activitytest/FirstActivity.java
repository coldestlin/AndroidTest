package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
//import com.example.activitytest.SecondActivity; //����ͬ���ļ����µ�����class������Ҫ����importҲ��ʹ��
//��˵��ʵ��android�����ǣ�Ҳû�п���main����������

public class FirstActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Button button=(Button)findViewById(R.id.button_1);
		button.setOnClickListener(new OnClickListener(){//�������࣬���ҹ����º�������
			@Override
			public void onClick(View V){
			//Toast.makeText(FirstActivity.this, "love is blind", Toast.LENGTH_SHORT).show();
			
			//finish(); ���������䣬һ������˳�
				
			//Intent intent=new Intent(FirstActivity.this,SecondActivity.class);//��һ��ʹ�ã����캯��һ
			//startActivity(intent);
				
			Intent intent=new Intent("com.example.activitytest.ACTION_START");//���캯����
			intent.addCategory("com.example.activitytest.MY_CATEGORY");//�����ڶ�����ťҳ��
			startActivity(intent);
				
			}						
		});//�����඼���������������棬����÷�̫�����ˡ�		
		}
		
	public boolean onCreateOptionsMenu(Menu menu){//��������ֵΪboolean
		getMenuInflater().inflate(R.menu.main, menu); //�����˲˵�
		return true;
		
	}
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this, "�ر�����", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(FirstActivity.this, "ĥ�˵�С����",Toast.LENGTH_LONG).show();
			break;
		default:
			}
		return true;
	}
		
}
