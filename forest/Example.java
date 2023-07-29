package forest;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import condition.Condition;

public class Example {
    // ファイルパスを予め設定
    private static String filePath1 = "resources/data/tree.txt";
    private static String filePath2 = "resources/data/forest.txt";
    private static String filePath3 = "resources/data/semilattice.txt";


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("File Selector");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // ボタン1
            JButton button1 = new JButton("Run with preset file 1");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    runForestModel(filePath1);
                }
            });

            // ボタン2
            JButton button2 = new JButton("Run with preset file 2");
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    runForestModel(filePath2);
                }
            });

            // ボタン３
            JButton button3 = new JButton("Run with preset file 3");
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    runForestModel(filePath3);
                }
            });

            // レイアウトを設定し、ボタンを追加
            frame.setLayout(new FlowLayout());
            frame.getContentPane().add(button1);
            frame.getContentPane().add(button2);
            frame.getContentPane().add(button3);

            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }

    public static void runForestModel(String aFilePass) {
    /*// 引数が無い（樹状整列データファイルの在り処がわからない）をチェックする。
		new Condition(() -> arguments.length < 1).ifTrue(() ->
		{
			System.err.println("There are too few arguments.");
			System.exit(1);
		});*/

		// 第1引数で指定された樹状整列データファイルの存在をチェックする。
		File aFile = new File(aFilePass);
		new Condition(() -> !(aFile.exists())).ifTrue(() ->
		{
			System.err.println("'" + aFile + "' does not exist.");
			System.exit(1);
		});

		// MVCを作成する。
		ForestModel aModel = new ForestModel(aFile);
		ForestView aView = new ForestView(aModel);

		// ウィンドウを生成して開く。
		JFrame aWindow = new JFrame(aFile.getName());
		aWindow.getContentPane().add(aView);
		aWindow.setMinimumSize(new Dimension(400, 300));
		aWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		aWindow.setSize(800, 600);
		aWindow.setLocationRelativeTo(null);
		aWindow.setVisible(true);

		// 樹状整列のアニメーションを行う。
        new Thread(() -> aModel.animate()).start();

		return;
    }
}