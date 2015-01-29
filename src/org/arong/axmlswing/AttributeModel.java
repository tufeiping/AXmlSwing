package org.arong.axmlswing;
/**
 * 控件属性模型
 * @author dipoo
 * @since 2015-01-28
 */
public class AttributeModel {
	private String id;
	private String name;
	private Integer x = 0;
	private Integer y = 0;
	private Integer width = 60;
	private Integer height = 30;
	private String size;
	private String bounds;
	private Float alignmentX;
	private Float alignmentY;
	private Boolean autoscrolls;
	private String background;
	private String foreground;
	private Boolean enabled;
	private String maximumSize;
	private String minimumSize;
	private String preferredSize;
	private Boolean opaque;//如果为 true，则该组件绘制其边界内的所有像素。
	private String toolTipText;
	private Boolean visible;
	private Boolean alwaysOnTop;
	private String iconImage;
	private String text;
	private String actionCommand;
	private Boolean borderPainted;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBounds() {
		return bounds;
	}
	public void setBounds(String bounds) {
		this.bounds = bounds;
	}
	public Float getAlignmentX() {
		return alignmentX;
	}
	public void setAlignmentX(Float alignmentX) {
		this.alignmentX = alignmentX;
	}
	public Float getAlignmentY() {
		return alignmentY;
	}
	public void setAlignmentY(Float alignmentY) {
		this.alignmentY = alignmentY;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public String getForeground() {
		return foreground;
	}
	public void setForeground(String foreground) {
		this.foreground = foreground;
	}
	public String getMaximumSize() {
		return maximumSize;
	}
	public void setMaximumSize(String maximumSize) {
		this.maximumSize = maximumSize;
	}
	public String getMinimumSize() {
		return minimumSize;
	}
	public void setMinimumSize(String minimumSize) {
		this.minimumSize = minimumSize;
	}
	public String getPreferredSize() {
		return preferredSize;
	}
	public void setPreferredSize(String preferredSize) {
		this.preferredSize = preferredSize;
	}
	public String getToolTipText() {
		return toolTipText;
	}
	public void setToolTipText(String toolTipText) {
		this.toolTipText = toolTipText;
	}
	public String getIconImage() {
		return iconImage;
	}
	public void setIconImage(String iconImage) {
		this.iconImage = iconImage;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public void setActionCommand(String actionCommand) {
		this.actionCommand = actionCommand;
	}
	public String getActionCommand() {
		return actionCommand;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setBorderPainted(Boolean borderPainted) {
		this.borderPainted = borderPainted;
	}
	public Boolean getBorderPainted() {
		return borderPainted;
	}
	public Boolean getAutoscrolls() {
		return autoscrolls;
	}
	public void setAutoscrolls(Boolean autoscrolls) {
		this.autoscrolls = autoscrolls;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Boolean getOpaque() {
		return opaque;
	}
	public void setOpaque(Boolean opaque) {
		this.opaque = opaque;
	}
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	public Boolean getAlwaysOnTop() {
		return alwaysOnTop;
	}
	public void setAlwaysOnTop(Boolean alwaysOnTop) {
		this.alwaysOnTop = alwaysOnTop;
	}
}