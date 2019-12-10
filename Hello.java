public class Hello extends AppcompactActivity{
        protected void onCreate(Bundle saveInstanceState){
                super.onCreate(saveInstanceState);
                setContentView(R.layout.activity_main);

        }
	public void m_one(){
        Log.d("TAG","one");
	}public void m_two(){
	Log.d("TAG","two");
   	}
}
