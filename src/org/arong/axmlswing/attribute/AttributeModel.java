package org.arong.axmlswing.attribute;
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
	private Float alignmentX;//垂直对齐方式
	private Float alignmentY;//水平对齐方式
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
	private Boolean contentAreaFilled;//是否填充
	private String icon;//图标
	private String disabledIcon;
	private String disabledSelectedIcon;
	private String pressedIcon;
	private String rolloverIcon;//翻转图标
	private String rolloverSelectedIcon;
	private Boolean defaultCapable;
	private String cursor;//光标类型
	private Boolean focusable;//能否聚焦
	private Boolean focusPainted;//是否绘制焦点
	private String font;//字体
	private Boolean hideActionText;
	private Integer horizontalAlignment;//水平对齐方式
	private Integer horizontalTextPosition;//文本相对于图标的水平位置
	private Integer verticalAlignment;//图标和文本的垂直对齐方式。
	private Integer verticalTextPosition;//文本相对于图标的垂直位置
	private Integer iconTextGap;//图标与文本间隔，默认四个像素
	private Boolean ignoreRepaint;
	private Boolean inheritsPopupMenu;
	private Integer mnemonic;//键盘助记符
	private Boolean requestFocusEnabled;
	private Boolean rolloverEnabled;
	private String margin;//按钮边框和标签之间的空白
	private Boolean selected;
	private Boolean verifyInputWhenFocusTarget;
	private Boolean doubleBuffered;
	
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
	public void setContentAreaFilled(Boolean contentAreaFilled) {
		this.contentAreaFilled = contentAreaFilled;
	}
	public Boolean getContentAreaFilled() {
		return contentAreaFilled;
	}
	public void setDisabledIcon(String disabledIcon) {
		this.disabledIcon = disabledIcon;
	}
	public String getDisabledIcon() {
		return disabledIcon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIcon() {
		return icon;
	}
	public void setDefaultCapable(Boolean defaultCapable) {
		this.defaultCapable = defaultCapable;
	}
	public Boolean getDefaultCapable() {
		return defaultCapable;
	}
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}
	public String getCursor() {
		return cursor;
	}
	public void setDisabledSelectedIcon(String disabledSelectedIcon) {
		this.disabledSelectedIcon = disabledSelectedIcon;
	}
	public String getDisabledSelectedIcon() {
		return disabledSelectedIcon;
	}
	public void setFocusable(Boolean focusable) {
		this.focusable = focusable;
	}
	public Boolean getFocusable() {
		return focusable;
	}
	public void setFocusPainted(Boolean focusPainted) {
		this.focusPainted = focusPainted;
	}
	public Boolean getFocusPainted() {
		return focusPainted;
	}
	public void setFont(String font) {
		this.font = font;
	}
	public String getFont() {
		return font;
	}
	public void setHideActionText(Boolean hideActionText) {
		this.hideActionText = hideActionText;
	}
	public Boolean getHideActionText() {
		return hideActionText;
	}
	public void setHorizontalAlignment(Integer horizontalAlignment) {
		this.horizontalAlignment = horizontalAlignment;
	}
	public Integer getHorizontalAlignment() {
		return horizontalAlignment;
	}
	public void setHorizontalTextPosition(Integer horizontalTextPosition) {
		this.horizontalTextPosition = horizontalTextPosition;
	}
	public Integer getHorizontalTextPosition() {
		return horizontalTextPosition;
	}
	public void setIconTextGap(Integer iconTextGap) {
		this.iconTextGap = iconTextGap;
	}
	public Integer getIconTextGap() {
		return iconTextGap;
	}
	public void setIgnoreRepaint(Boolean ignoreRepaint) {
		this.ignoreRepaint = ignoreRepaint;
	}
	public Boolean getIgnoreRepaint() {
		return ignoreRepaint;
	}
	public void setInheritsPopupMenu(Boolean inheritsPopupMenu) {
		this.inheritsPopupMenu = inheritsPopupMenu;
	}
	public Boolean getInheritsPopupMenu() {
		return inheritsPopupMenu;
	}
	public void setPressedIcon(String pressedIcon) {
		this.pressedIcon = pressedIcon;
	}
	public String getPressedIcon() {
		return pressedIcon;
	}
	public void setMnemonic(Integer mnemonic) {
		this.mnemonic = mnemonic;
	}
	public Integer getMnemonic() {
		return mnemonic;
	}
	public void setRequestFocusEnabled(Boolean requestFocusEnabled) {
		this.requestFocusEnabled = requestFocusEnabled;
	}
	public Boolean getRequestFocusEnabled() {
		return requestFocusEnabled;
	}
	public void setRolloverIcon(String rolloverIcon) {
		this.rolloverIcon = rolloverIcon;
	}
	public String getRolloverIcon() {
		return rolloverIcon;
	}
	public void setRolloverSelectedIcon(String rolloverSelectedIcon) {
		this.rolloverSelectedIcon = rolloverSelectedIcon;
	}
	public String getRolloverSelectedIcon() {
		return rolloverSelectedIcon;
	}
	public void setRolloverEnabled(Boolean rolloverEnabled) {
		this.rolloverEnabled = rolloverEnabled;
	}
	public Boolean getRolloverEnabled() {
		return rolloverEnabled;
	}
	public void setMargin(String margin) {
		this.margin = margin;
	}
	public String getMargin() {
		return margin;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	public Boolean getSelected() {
		return selected;
	}
	public void setVerifyInputWhenFocusTarget(Boolean verifyInputWhenFocusTarget) {
		this.verifyInputWhenFocusTarget = verifyInputWhenFocusTarget;
	}
	public Boolean getVerifyInputWhenFocusTarget() {
		return verifyInputWhenFocusTarget;
	}
	public void setVerticalAlignment(Integer verticalAlignment) {
		this.verticalAlignment = verticalAlignment;
	}
	public Integer getVerticalAlignment() {
		return verticalAlignment;
	}
	public void setVerticalTextPosition(Integer verticalTextPosition) {
		this.verticalTextPosition = verticalTextPosition;
	}
	public Integer getVerticalTextPosition() {
		return verticalTextPosition;
	}
	public void setDoubleBuffered(Boolean doubleBuffered) {
		this.doubleBuffered = doubleBuffered;
	}
	public Boolean getDoubleBuffered() {
		return doubleBuffered;
	}
}