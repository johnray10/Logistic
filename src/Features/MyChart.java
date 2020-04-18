
package Submodule;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Jayjomjohn
 */
public class MyChart extends javax.swing.JPanel {

    private String title ="MyChart";
    DefaultPieDataset dataset;
    JFreeChart chart;
    ChartPanel chartPanel;
    
    public MyChart() {
        initComponents();
        createChart();
        
    }
    
    
    public final void createChart(){    
        dataset = createDataset();
        chart = createChart(dataset, title);
        chartPanel = new ChartPanel(chart);
        this.add(chartPanel);
    }
   private  DefaultPieDataset createDataset() {
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Linux", 10);
        result.setValue("Mac", 20);
        result.setValue("Windows", 50);
        return result;

    }
    
    private JFreeChart createChart(PieDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createPieChart3D(title,dataset,true,true,false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
        chart.getTitle().setText(title);
    }
    
    public void setValue(String name,int values){
        dataset.setValue(name, values);
    }
    
    public void setValue(String name,double values){
        dataset.setValue(name, values);
    }
    
    public void setBackgroundImage(Icon Image){
        ImageIcon icon = (ImageIcon)Image;
        chart.setBackgroundImage(icon.getImage());
    }
    
    public void setBackgroundColor(Color color){
        chart.setBackgroundPaint(color);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
