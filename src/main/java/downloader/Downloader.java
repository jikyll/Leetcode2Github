package downloader;

import java.util.List;

public interface Downloader {
	/**
	 * set thread for downloader
	 * @param thread
	 */
	public void setTread(Thread thread);
	
	/**
	 * according to the url given, download aimed file(url or code) and add to list 
	 * @param url
	 * @param list
	 */
	public void download(String url);
	
	/**
	 * 爬取题目列表
	 * @param url
	 * @return 
	 */
	public List<String> problemListDownloader();
	
	/**
	 * 进入题目描述页面，爬取题目提交url列表
	 * @param url
	 */
	public List<String> problemDescriptionDownloader(String url);
	
	/**
	 *	进入题目提交列表页面，爬取code所在页面url 
	 * @param url
	 */
	public List<String> submissionListDownloader(String url, String name);
	
	/**
	 * 进入code所在页面，爬取code
	 * @param url
	 */
	public List<String> codePageDownloader(String url);
}
