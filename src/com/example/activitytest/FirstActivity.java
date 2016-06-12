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
//import com.example.activitytest.SecondActivity; //好像同个文件夹下的其他class，不需要加入import也能使用
//话说其实在android厘米那，也没有看到main主函数啊。

public class FirstActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Button button=(Button)findViewById(R.id.button_1);
		button.setOnClickListener(new OnClickListener(){//创建新类，并且构建新函数覆盖
			@Override
			public void onClick(View V){
			//Toast.makeText(FirstActivity.this, "love is blind", Toast.LENGTH_SHORT).show();
			
			//finish(); 加入这个语句，一点击就退出
				
			//Intent intent=new Intent(FirstActivity.this,SecondActivity.class);//第一次使用，构造函数一
			//startActivity(intent);
				
			Intent intent=new Intent("com.example.activitytest.ACTION_START");//构造函数二
			intent.addCategory("com.example.activitytest.MY_CATEGORY");//调出第二个按钮页面
			startActivity(intent);
				
			}						
		});//整个类都被包含在括号里面，这个用法太神奇了。		
		}
		
	public boolean onCreateOptionsMenu(Menu menu){//函数返回值为boolean
		getMenuInflater().inflate(R.menu.main, menu); //调用了菜单
		return true;
		
	}
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this, "地爆天星", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(FirstActivity.this, "磨人的小妖精",Toast.LENGTH_LONG).show();
			break;
		default:
			}
		return true;
	}
		
}
