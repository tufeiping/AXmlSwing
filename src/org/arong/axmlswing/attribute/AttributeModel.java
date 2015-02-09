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
	private String location;
	private String bounds;
	private Float alignmentX;//垂直对齐方式
	private Float alignmentY;//水平对齐方式
	private String background;
	private String foreground;
	private String maximumSize;
	private String minimumSize;
	private String preferredSize;
	private Boolean visible;
	private Boolean autoscrolls;
	private Boolean enabled;
	
	
	private String title;
	private Integer defaultCloseOperation;
	private String locationRelativeTo;
	private Boolean alwaysOnTop;
	private String iconImage;
	private String maximizedBounds;//最大化边界
	private Boolean resizable;//是否可由用户调整大小
	private Boolean focusableWindowState;//是否可以成为焦点窗口
	private Boolean locationByPlatform;//窗口应出现在默认位置，则为 true，如果应出现在当前位置，则为 false
	
	private String caretColor;//光标颜色
	private String selectionColor;//呈现选定的当前颜色
	private String selectedTextColor;//选中文本颜色
	private String disabledTextColor;//
	private Integer caretPosition;//光标位置，此位置不能大于文本长度
	private Integer columns;//设置此 TextField 中的列数,不能小于0
	private Boolean dragEnabled;//是否启用自动拖动处理
	private Boolean editable;//是否可编辑
	private Integer scrollOffset;//滚动偏移量,单位:像素
	private Integer selectionStart;//选择开始点设置为指定的位置
	private Integer selectionEnd;//选择结束点设置为指定的位置
	private String page;//设置当前要显示的 URL
	private String contentType;//设置此编辑器所处理的内容类型
	
	private Boolean lineWrap;//是否可以换行
	private Integer rows;//设置此 TextArea 的行数
	private Integer tabSize;//设置选项卡要扩大到的字符数
	private Boolean wrapStyleWord;//是否应该使用单词边界来换行
	
	private Boolean armed;// 将菜单项标识为“调出”。
	private Integer delay;//向上或向下弹出前建议的延迟
	private String menuLocation;//设置弹出组件的位置。
	private Boolean popupMenuVisible;//设置菜单弹出的可见性
	private Boolean state;//选定状态
	
	private String color;
	
	private Boolean closable;//设置是否可以通过某个用户操作关闭此 JInternalFrame。
	private Boolean closed;//如果参数为 true，则关闭此内部窗体
	private Boolean iconifiable;//设置 iconable 属性，对于能够使 JInternalFrame 变成一个图标的用户而言，该属性必须为 true。某些外观可能不实现图标化；它们将忽略此属性。
	private String frameIcon;//设置要在此内部窗体的标题栏中显示的图像（通常显示在左上角）。
	private Integer layer;// 设置此组件 layer 属性的便捷方法
	private Boolean maximizable;//是否可以通过某个用户操作最大化此 JInternalFrame
	//private Boolean maximum;// 最大化并还原此内部窗体。
	private Boolean rootPaneCheckingEnabled;//设置是否将对 add 和 setLayout 的调用转发到 contentPane
	
	private Integer windowDecorationStyle;//设置 JRootPane应提供的 Window装饰类型（例如，边界、关闭 Window 的小部件、标题等）。
	
	//scroll
	private Integer horizontalScrollBarPolicy;//确定水平滚动条何时显示在滚动窗格上
	private Integer verticalScrollBarPolicy;//确定垂直滚动条何时显示在滚动窗格上
	
	//jList
	private Integer fixedCellHeight;//设置一个固定值，将用于列表中每个单元的高度。
	private Integer fixedCellWidth;//设置一个固定值，将用于列表中每个单元的宽度。
	private Integer layoutOrientation;//定义布置列表单元的方式。
	private Integer selectedIndex;//根据索引选中列表项
	private String selectionBackground;//设置用于绘制选定项的背景的颜色，单元渲染器可以使用此颜色填充所选单元。
	private String selectionForeground;//设置用于绘制选定项的前景的颜色，单元渲染器可以使用此颜色呈现文本和图形。
	private String selectionInterval;//选择指定的间隔
	private Integer selectionMode;//设置列表的选择模式
	private Boolean valueIsAdjusting;
	private Integer visibleRowCount;//指示要显示的首选行数（不要求滚动）
	
	//JPopupMenu
	private Boolean defaultLightWeightPopupEnabled;//弹出菜单是否为轻量级
	private Boolean lightWeightPopupEnabled;//是否为禁用弹出菜单轻量级
	private String label;//设置弹出菜单的标签
	private String popupSize;//设置弹出窗口的大小
	
	//JProgressBar
	private Boolean indeterminate;//进度条处于确定模式中还是处于不确定模式中
	private Integer maximum;//设置进度条的最大值
	private Integer minimum;//设置进度条的最小值
	private Integer orientation;//设置进度条的方向
	private String string;//设置进度字符串的值
	private Boolean stringPainted;//进度条是否应该呈现进度字符串
	
	//JSlider
	private Integer extent;//设置滑块所“覆盖”的范围的大小
	private Boolean inverted;//是否转滑块显示的值范围
	private Integer majorTickSpacing;//设置主刻度标记的间隔
	private Integer minorTickSpacing;//设置次刻度标记的间隔
	private Boolean paintLabels;//是否在滑块上绘制标签
	private Boolean paintTicks;//是否在滑块上绘制刻度标记
	private Boolean paintTrack;//是否在滑块上绘制滑道
	private Boolean snapToTicks;//是否解析为最靠近用户放置滑块处的刻度标记的值
	private Integer value;//设置滑块的当前值
	
	//JSplitPane
	private Boolean continuousLayout;//
	private Integer dividerLocation;//设置分隔条的位置
	private Integer dividerSize;// 设置分隔条的大小
	private Integer lastDividerLocation;//设置分隔条所处的最后位置
	private Boolean oneTouchExpandable;//
	private Double resizeWeight;// 指定当分隔窗格的大小改变时如何分配额外空间
	
	//JTabbedPane
	private String mnemonicAt;//设置用于访问指定选项卡的键盘助记符
	private Integer tabLayoutPolicy;//设置在一次运行中不能放入所有的选项卡时，选项卡窗格使用的对选项卡进行布局安排的策略
	private Integer tabPlacement;//设置此选项卡窗格的选项卡布局。
	
	//JTable
	private Boolean autoCreateColumnsFromModel;//是否应该自动创建列
	private Boolean autoCreateRowSorter;//指定其模型更改时是否应该为表创建一个 RowSorter
	private Integer autoResizeMode;//当调整表的大小时，设置表的自动调整模式
	private Boolean cellSelectionEnabled;//是否允许同时存在行选择和列选择
	private Boolean columnSelectionAllowed;//是否可以选择此模型中的列
	private String columnSelectionInterval;//选择从 index0 到 index1 之间（包含两端）的列
	private Integer editingColumn;//要编辑的单元格所在的列
	private Integer editingRow;//要编辑的单元格所在的行
	private Boolean fillsViewportHeight;//设置此表是否始终大到足以填充封闭视口的高度
	private String gridColor;//将用来绘制网格线的颜色设置为 gridColor 并重新显示它
	private String intercellSpacing;//指定单元格之间高度和宽度
	private String preferredScrollableViewportSize;//设置此表视口的首选大小
	private Integer rowHeight;//将所有单元格的高度设置为 rowHeight
	private Integer rowMargin;//设置相临行中单元格之间的间距
	private Boolean rowSelectionAllowed;//是否可以选择此模型中的行
	private String rowSelectionInterval;//选择从 index0 到 index1 之间（包含两端）的行。
	private Boolean showGrid;//是否绘制单元格周围的网格线
	private Boolean showHorizontalLines;//是否绘制单元格之间的水平线
	private Boolean showVerticalLines;//是否绘制单元格之间的垂直线
	private Boolean surrendersFocusOnKeystroke;//设置由于 JTable 为某个单元格转发键盘事件而导致编辑器被激活时，此 JTable 中的编辑器是否获得键盘焦点。
	private Boolean updateSelectionOnSort;// 指定排序后是否应该更新选择
	
	private Integer draggedDistance;//拖动的距离
	private Boolean reorderingAllowed;//是否可以拖动列头，以重新排序各列
	private Boolean resizingAllowed;//是否可以通过在头间拖动来调整各列的大小
	
	//JToolBar
	private Boolean floatable;//是否可以移动工具栏
	private Boolean rollover;//是否翻转工具栏
	
	private String tipText;//设置显示工具提示时要显示的文本。
	
	//JFileChooser
	private Integer debugGraphicsOptions;//启用或禁用与组件或其某个子组件内执行的每个图形操作有关的诊断信息。
	private Boolean acceptAllFileFilterUsed;//确定是否将 AcceptAll FileFilter 用作可选择过滤器列表中一个可用选项
	private String approveButtonText;//设置 FileChooserUI 中的 ApproveButton 内使用的文本
	private String approveButtonToolTipText;//设置 ApproveButton 中使用的工具提示文本
	private Boolean controlButtonsAreShown;//设置属性，指示在文件选择器中是否显示 approve 和 cancel 按钮。
	private String currentDirectory;//设置当前目录
	private String dialogTitle;//设置显示在 JFileChooser 窗口标题栏的字符串
	private Integer dialogType;//设置此对话框的类型
	private Boolean fileHidingEnabled;//设置是否实现文件隐藏
	private Integer fileSelectionMode;//设置 JFileChooser，以允许用户只选择文件、只选择目录，或者可选择文件和目录。
	private Boolean multiSelectionEnabled;//设置文件选择器，以允许选择多个文件
	private String selectedFile;//设置选中的文件
	private String selectedFiles;//设置选中的文件
	
	//JTree
	private Boolean expandsSelectedPaths;//
	private Boolean invokesStopCellEditing;//
	private Boolean largeModel;//指定 UI 是否使用大模型。
	private Boolean rootVisible;//确定 TreeModel 的根节点是否可见
	private Boolean scrollsOnExpand;//是否可以滚动显示以前隐藏的子节点
	private Integer selectionRow;//选择显示的指定行的节点
	private String selectionRows;//选择与显示的每个指定行对应的节点
	private Boolean showsRootHandles;//设置 showsRootHandles 属性的值，它指定是否应显示节点句柄
	private Integer toggleClickCount;//设置节点展开或关闭之前鼠标的单击数

	private String extentSize;//使用视图坐标设置该视图可见部分的大小
	private Integer scrollMode;//用于控制滚动视口内容的方法
	private String viewPosition;//设置显示在视口左上角的视图坐标，如果不存在视图，则不执行任何操作
	private String viewSize;//设置视图的大小
	
	private Integer dragMode;//设置桌面窗格使用的“拖动样式”。
	
	private Integer focusLostBehavior;//设置丢失焦点时的行为
	
	private Integer maximumRowCount;//设置 JComboBox 显示的最大行数
	private Boolean popupVisible;//设置弹出窗口的可见性
	
	private Boolean opaque;//如果为 true，则该组件绘制其边界内的所有像素。
	private String toolTipText;
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
	private Integer displayedMnemonicIndex;
	private Boolean focusCycleRoot;
	private Long multiClickThreshhold;
	
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
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setDefaultCloseOperation(Integer defaultCloseOperation) {
		this.defaultCloseOperation = defaultCloseOperation;
	}
	public Integer getDefaultCloseOperation() {
		return defaultCloseOperation;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocationRelativeTo(String locationRelativeTo) {
		this.locationRelativeTo = locationRelativeTo;
	}
	public String getLocationRelativeTo() {
		return locationRelativeTo;
	}
	public void setMaximizedBounds(String maximizedBounds) {
		this.maximizedBounds = maximizedBounds;
	}
	public String getMaximizedBounds() {
		return maximizedBounds;
	}
	public void setResizable(Boolean resizable) {
		this.resizable = resizable;
	}
	public Boolean getResizable() {
		return resizable;
	}
	public void setFocusableWindowState(Boolean focusableWindowState) {
		this.focusableWindowState = focusableWindowState;
	}
	public Boolean getFocusableWindowState() {
		return focusableWindowState;
	}
	public void setLocationByPlatform(Boolean locationByPlatform) {
		this.locationByPlatform = locationByPlatform;
	}
	public Boolean getLocationByPlatform() {
		return locationByPlatform;
	}
	public void setCaretColor(String caretColor) {
		this.caretColor = caretColor;
	}
	public String getCaretColor() {
		return caretColor;
	}
	public void setSelectionColor(String selectionColor) {
		this.selectionColor = selectionColor;
	}
	public String getSelectionColor() {
		return selectionColor;
	}
	public void setSelectedTextColor(String selectedTextColor) {
		this.selectedTextColor = selectedTextColor;
	}
	public String getSelectedTextColor() {
		return selectedTextColor;
	}
	public void setCaretPosition(Integer caretPosition) {
		this.caretPosition = caretPosition;
	}
	public Integer getCaretPosition() {
		return caretPosition;
	}
	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	public Integer getColumns() {
		return columns;
	}
	public void setDisabledTextColor(String disabledTextColor) {
		this.disabledTextColor = disabledTextColor;
	}
	public String getDisabledTextColor() {
		return disabledTextColor;
	}
	public void setDragEnabled(Boolean dragEnabled) {
		this.dragEnabled = dragEnabled;
	}
	public Boolean getDragEnabled() {
		return dragEnabled;
	}
	public void setEditable(Boolean editable) {
		this.editable = editable;
	}
	public Boolean getEditable() {
		return editable;
	}
	public void setScrollOffset(Integer scrollOffset) {
		this.scrollOffset = scrollOffset;
	}
	public Integer getScrollOffset() {
		return scrollOffset;
	}
	public void setSelectionStart(Integer selectionStart) {
		this.selectionStart = selectionStart;
	}
	public Integer getSelectionStart() {
		return selectionStart;
	}
	public void setSelectionEnd(Integer selectionEnd) {
		this.selectionEnd = selectionEnd;
	}
	public Integer getSelectionEnd() {
		return selectionEnd;
	}
	public void setLineWrap(Boolean lineWrap) {
		this.lineWrap = lineWrap;
	}
	public Boolean getLineWrap() {
		return lineWrap;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getRows() {
		return rows;
	}
	public void setTabSize(Integer tabSize) {
		this.tabSize = tabSize;
	}
	public Integer getTabSize() {
		return tabSize;
	}
	public void setWrapStyleWord(Boolean wrapStyleWord) {
		this.wrapStyleWord = wrapStyleWord;
	}
	public Boolean getWrapStyleWord() {
		return wrapStyleWord;
	}
	public Integer getDisplayedMnemonicIndex() {
		return displayedMnemonicIndex;
	}
	public void setDisplayedMnemonicIndex(Integer displayedMnemonicIndex) {
		this.displayedMnemonicIndex = displayedMnemonicIndex;
	}
	public Boolean getFocusCycleRoot() {
		return focusCycleRoot;
	}
	public void setFocusCycleRoot(Boolean focusCycleRoot) {
		this.focusCycleRoot = focusCycleRoot;
	}
	public Long getMultiClickThreshhold() {
		return multiClickThreshhold;
	}
	public void setMultiClickThreshhold(Long multiClickThreshhold) {
		this.multiClickThreshhold = multiClickThreshhold;
	}
	public void setArmed(Boolean armed) {
		this.armed = armed;
	}
	public Boolean getArmed() {
		return armed;
	}
	public void setDelay(Integer delay) {
		this.delay = delay;
	}
	public Integer getDelay() {
		return delay;
	}
	public void setMenuLocation(String menuLocation) {
		this.menuLocation = menuLocation;
	}
	public String getMenuLocation() {
		return menuLocation;
	}
	public void setPopupMenuVisible(Boolean popupMenuVisible) {
		this.popupMenuVisible = popupMenuVisible;
	}
	public Boolean getPopupMenuVisible() {
		return popupMenuVisible;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public Boolean getState() {
		return state;
	}
	public void setWindowDecorationStyle(Integer windowDecorationStyle) {
		this.windowDecorationStyle = windowDecorationStyle;
	}
	public Integer getWindowDecorationStyle() {
		return windowDecorationStyle;
	}
	public void setHorizontalScrollBarPolicy(Integer horizontalScrollBarPolicy) {
		this.horizontalScrollBarPolicy = horizontalScrollBarPolicy;
	}
	public Integer getHorizontalScrollBarPolicy() {
		return horizontalScrollBarPolicy;
	}
	public void setVerticalScrollBarPolicy(Integer verticalScrollBarPolicy) {
		this.verticalScrollBarPolicy = verticalScrollBarPolicy;
	}
	public Integer getVerticalScrollBarPolicy() {
		return verticalScrollBarPolicy;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setClosable(Boolean closable) {
		this.closable = closable;
	}
	public Boolean getClosable() {
		return closable;
	}
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
	public Boolean getClosed() {
		return closed;
	}
	public void setIconifiable(Boolean iconifiable) {
		this.iconifiable = iconifiable;
	}
	public Boolean getIconifiable() {
		return iconifiable;
	}
	public void setFrameIcon(String frameIcon) {
		this.frameIcon = frameIcon;
	}
	public String getFrameIcon() {
		return frameIcon;
	}
	public void setLayer(Integer layer) {
		this.layer = layer;
	}
	public Integer getLayer() {
		return layer;
	}
	public void setMaximizable(Boolean maximizable) {
		this.maximizable = maximizable;
	}
	public Boolean getMaximizable() {
		return maximizable;
	}
	public void setRootPaneCheckingEnabled(Boolean rootPaneCheckingEnabled) {
		this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
	}
	public Boolean getRootPaneCheckingEnabled() {
		return rootPaneCheckingEnabled;
	}
	public void setFixedCellHeight(Integer fixedCellHeight) {
		this.fixedCellHeight = fixedCellHeight;
	}
	public Integer getFixedCellHeight() {
		return fixedCellHeight;
	}
	public void setFixedCellWidth(Integer fixedCellWidth) {
		this.fixedCellWidth = fixedCellWidth;
	}
	public Integer getFixedCellWidth() {
		return fixedCellWidth;
	}
	public void setLayoutOrientation(Integer layoutOrientation) {
		this.layoutOrientation = layoutOrientation;
	}
	public Integer getLayoutOrientation() {
		return layoutOrientation;
	}
	public void setSelectedIndex(Integer selectedIndex) {
		this.selectedIndex = selectedIndex;
	}
	public Integer getSelectedIndex() {
		return selectedIndex;
	}
	public void setSelectionBackground(String selectionBackground) {
		this.selectionBackground = selectionBackground;
	}
	public String getSelectionBackground() {
		return selectionBackground;
	}
	public void setSelectionForeground(String selectionForeground) {
		this.selectionForeground = selectionForeground;
	}
	public String getSelectionForeground() {
		return selectionForeground;
	}
	public void setSelectionInterval(String selectionInterval) {
		this.selectionInterval = selectionInterval;
	}
	public String getSelectionInterval() {
		return selectionInterval;
	}
	public void setSelectionMode(Integer selectionMode) {
		this.selectionMode = selectionMode;
	}
	public Integer getSelectionMode() {
		return selectionMode;
	}
	public void setValueIsAdjusting(Boolean valueIsAdjusting) {
		this.valueIsAdjusting = valueIsAdjusting;
	}
	public Boolean getValueIsAdjusting() {
		return valueIsAdjusting;
	}
	public void setVisibleRowCount(Integer visibleRowCount) {
		this.visibleRowCount = visibleRowCount;
	}
	public Integer getVisibleRowCount() {
		return visibleRowCount;
	}
	public void setDefaultLightWeightPopupEnabled(
			Boolean defaultLightWeightPopupEnabled) {
		this.defaultLightWeightPopupEnabled = defaultLightWeightPopupEnabled;
	}
	public Boolean getDefaultLightWeightPopupEnabled() {
		return defaultLightWeightPopupEnabled;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLabel() {
		return label;
	}
	public void setLightWeightPopupEnabled(Boolean lightWeightPopupEnabled) {
		this.lightWeightPopupEnabled = lightWeightPopupEnabled;
	}
	public Boolean getLightWeightPopupEnabled() {
		return lightWeightPopupEnabled;
	}
	public void setPopupSize(String popupSize) {
		this.popupSize = popupSize;
	}
	public String getPopupSize() {
		return popupSize;
	}
	public void setIndeterminate(Boolean indeterminate) {
		this.indeterminate = indeterminate;
	}
	public Boolean getIndeterminate() {
		return indeterminate;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	public Integer getMinimum() {
		return minimum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setOrientation(Integer orientation) {
		this.orientation = orientation;
	}
	public Integer getOrientation() {
		return orientation;
	}
	public void setString(String string) {
		this.string = string;
	}
	public String getString() {
		return string;
	}
	public void setStringPainted(Boolean stringPainted) {
		this.stringPainted = stringPainted;
	}
	public Boolean getStringPainted() {
		return stringPainted;
	}
	public void setExtent(Integer extent) {
		this.extent = extent;
	}
	public Integer getExtent() {
		return extent;
	}
	public void setInverted(Boolean inverted) {
		this.inverted = inverted;
	}
	public Boolean getInverted() {
		return inverted;
	}
	public void setMajorTickSpacing(Integer majorTickSpacing) {
		this.majorTickSpacing = majorTickSpacing;
	}
	public Integer getMajorTickSpacing() {
		return majorTickSpacing;
	}
	public void setMinorTickSpacing(Integer minorTickSpacing) {
		this.minorTickSpacing = minorTickSpacing;
	}
	public Integer getMinorTickSpacing() {
		return minorTickSpacing;
	}
	public void setPaintLabels(Boolean paintLabels) {
		this.paintLabels = paintLabels;
	}
	public Boolean getPaintLabels() {
		return paintLabels;
	}
	public void setPaintTicks(Boolean paintTicks) {
		this.paintTicks = paintTicks;
	}
	public Boolean getPaintTicks() {
		return paintTicks;
	}
	public void setPaintTrack(Boolean paintTrack) {
		this.paintTrack = paintTrack;
	}
	public Boolean getPaintTrack() {
		return paintTrack;
	}
	public void setSnapToTicks(Boolean snapToTicks) {
		this.snapToTicks = snapToTicks;
	}
	public Boolean getSnapToTicks() {
		return snapToTicks;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getValue() {
		return value;
	}
	public void setContinuousLayout(Boolean continuousLayout) {
		this.continuousLayout = continuousLayout;
	}
	public Boolean getContinuousLayout() {
		return continuousLayout;
	}
	public void setDividerSize(Integer dividerSize) {
		this.dividerSize = dividerSize;
	}
	public Integer getDividerSize() {
		return dividerSize;
	}
	public void setLastDividerLocation(Integer lastDividerLocation) {
		this.lastDividerLocation = lastDividerLocation;
	}
	public Integer getLastDividerLocation() {
		return lastDividerLocation;
	}
	public void setResizeWeight(Double resizeWeight) {
		this.resizeWeight = resizeWeight;
	}
	public Double getResizeWeight() {
		return resizeWeight;
	}
	public void setOneTouchExpandable(Boolean oneTouchExpandable) {
		this.oneTouchExpandable = oneTouchExpandable;
	}
	public Boolean getOneTouchExpandable() {
		return oneTouchExpandable;
	}
	public void setDividerLocation(Integer dividerLocation) {
		this.dividerLocation = dividerLocation;
	}
	public Integer getDividerLocation() {
		return dividerLocation;
	}
	public void setMnemonicAt(String mnemonicAt) {
		this.mnemonicAt = mnemonicAt;
	}
	public String getMnemonicAt() {
		return mnemonicAt;
	}
	public void setTabLayoutPolicy(Integer tabLayoutPolicy) {
		this.tabLayoutPolicy = tabLayoutPolicy;
	}
	public Integer getTabLayoutPolicy() {
		return tabLayoutPolicy;
	}
	public void setTabPlacement(Integer tabPlacement) {
		this.tabPlacement = tabPlacement;
	}
	public Integer getTabPlacement() {
		return tabPlacement;
	}
	public void setAutoCreateColumnsFromModel(Boolean autoCreateColumnsFromModel) {
		this.autoCreateColumnsFromModel = autoCreateColumnsFromModel;
	}
	public Boolean getAutoCreateColumnsFromModel() {
		return autoCreateColumnsFromModel;
	}
	public void setAutoCreateRowSorter(Boolean autoCreateRowSorter) {
		this.autoCreateRowSorter = autoCreateRowSorter;
	}
	public Boolean getAutoCreateRowSorter() {
		return autoCreateRowSorter;
	}
	public void setAutoResizeMode(Integer autoResizeMode) {
		this.autoResizeMode = autoResizeMode;
	}
	public Integer getAutoResizeMode() {
		return autoResizeMode;
	}
	public void setCellSelectionEnabled(Boolean cellSelectionEnabled) {
		this.cellSelectionEnabled = cellSelectionEnabled;
	}
	public Boolean getCellSelectionEnabled() {
		return cellSelectionEnabled;
	}
	public void setColumnSelectionAllowed(Boolean columnSelectionAllowed) {
		this.columnSelectionAllowed = columnSelectionAllowed;
	}
	public Boolean getColumnSelectionAllowed() {
		return columnSelectionAllowed;
	}
	public void setColumnSelectionInterval(String columnSelectionInterval) {
		this.columnSelectionInterval = columnSelectionInterval;
	}
	public String getColumnSelectionInterval() {
		return columnSelectionInterval;
	}
	public void setEditingColumn(Integer editingColumn) {
		this.editingColumn = editingColumn;
	}
	public Integer getEditingColumn() {
		return editingColumn;
	}
	public void setEditingRow(Integer editingRow) {
		this.editingRow = editingRow;
	}
	public Integer getEditingRow() {
		return editingRow;
	}
	public void setFillsViewportHeight(Boolean fillsViewportHeight) {
		this.fillsViewportHeight = fillsViewportHeight;
	}
	public Boolean getFillsViewportHeight() {
		return fillsViewportHeight;
	}
	public void setGridColor(String gridColor) {
		this.gridColor = gridColor;
	}
	public String getGridColor() {
		return gridColor;
	}
	public void setIntercellSpacing(String intercellSpacing) {
		this.intercellSpacing = intercellSpacing;
	}
	public String getIntercellSpacing() {
		return intercellSpacing;
	}
	public void setPreferredScrollableViewportSize(
			String preferredScrollableViewportSize) {
		this.preferredScrollableViewportSize = preferredScrollableViewportSize;
	}
	public String getPreferredScrollableViewportSize() {
		return preferredScrollableViewportSize;
	}
	public void setRowHeight(Integer rowHeight) {
		this.rowHeight = rowHeight;
	}
	public Integer getRowHeight() { 
		return rowHeight;
	}
	public void setRowMargin(Integer rowMargin) {
		this.rowMargin = rowMargin;
	}
	public Integer getRowMargin() {
		return rowMargin;
	}
	public void setRowSelectionAllowed(Boolean rowSelectionAllowed) {
		this.rowSelectionAllowed = rowSelectionAllowed;
	}
	public Boolean getRowSelectionAllowed() {
		return rowSelectionAllowed;
	}
	public void setRowSelectionInterval(String rowSelectionInterval) {
		this.rowSelectionInterval = rowSelectionInterval;
	}
	public String getRowSelectionInterval() {
		return rowSelectionInterval;
	}
	public void setShowGrid(Boolean showGrid) {
		this.showGrid = showGrid;
	}
	public Boolean getShowGrid() {
		return showGrid;
	}
	public void setShowHorizontalLines(Boolean showHorizontalLines) {
		this.showHorizontalLines = showHorizontalLines;
	}
	public Boolean getShowHorizontalLines() {
		return showHorizontalLines;
	}
	public void setShowVerticalLines(Boolean showVerticalLines) {
		this.showVerticalLines = showVerticalLines;
	}
	public Boolean getShowVerticalLines() {
		return showVerticalLines;
	}
	public void setSurrendersFocusOnKeystroke(Boolean surrendersFocusOnKeystroke) {
		this.surrendersFocusOnKeystroke = surrendersFocusOnKeystroke;
	}
	public Boolean getSurrendersFocusOnKeystroke() {
		return surrendersFocusOnKeystroke;
	}
	public void setUpdateSelectionOnSort(Boolean updateSelectionOnSort) {
		this.updateSelectionOnSort = updateSelectionOnSort;
	}
	public Boolean getUpdateSelectionOnSort() {
		return updateSelectionOnSort;
	}
	public void setDraggedDistance(Integer draggedDistance) {
		this.draggedDistance = draggedDistance;
	}
	public Integer getDraggedDistance() {
		return draggedDistance;
	}
	public void setReorderingAllowed(Boolean reorderingAllowed) {
		this.reorderingAllowed = reorderingAllowed;
	}
	public Boolean getReorderingAllowed() {
		return reorderingAllowed;
	}
	public void setResizingAllowed(Boolean resizingAllowed) {
		this.resizingAllowed = resizingAllowed;
	}
	public Boolean getResizingAllowed() {
		return resizingAllowed;
	}
	public void setFloatable(Boolean floatable) {
		this.floatable = floatable;
	}
	public Boolean getFloatable() {
		return floatable;
	}
	public void setRollover(Boolean rollover) {
		this.rollover = rollover;
	}
	public Boolean getRollover() {
		return rollover;
	}
	public void setTipText(String tipText) {
		this.tipText = tipText;
	}
	public String getTipText() {
		return tipText;
	}
	public void setDebugGraphicsOptions(Integer debugGraphicsOptions) {
		this.debugGraphicsOptions = debugGraphicsOptions;
	}
	public Integer getDebugGraphicsOptions() {
		return debugGraphicsOptions;
	}
	public void setAcceptAllFileFilterUsed(Boolean acceptAllFileFilterUsed) {
		this.acceptAllFileFilterUsed = acceptAllFileFilterUsed;
	}
	public Boolean getAcceptAllFileFilterUsed() {
		return acceptAllFileFilterUsed;
	}
	public void setApproveButtonText(String approveButtonText) {
		this.approveButtonText = approveButtonText;
	}
	public String getApproveButtonText() {
		return approveButtonText;
	}
	public void setApproveButtonToolTipText(String approveButtonToolTipText) {
		this.approveButtonToolTipText = approveButtonToolTipText;
	}
	public String getApproveButtonToolTipText() {
		return approveButtonToolTipText;
	}
	public void setControlButtonsAreShown(Boolean controlButtonsAreShown) {
		this.controlButtonsAreShown = controlButtonsAreShown;
	}
	public Boolean getControlButtonsAreShown() {
		return controlButtonsAreShown;
	}
	public void setCurrentDirectory(String currentDirectory) {
		this.currentDirectory = currentDirectory;
	}
	public String getCurrentDirectory() {
		return currentDirectory;
	}
	public void setDialogTitle(String dialogTitle) {
		this.dialogTitle = dialogTitle;
	}
	public String getDialogTitle() {
		return dialogTitle;
	}
	public void setDialogType(Integer dialogType) {
		this.dialogType = dialogType;
	}
	public Integer getDialogType() {
		return dialogType;
	}
	public void setFileHidingEnabled(Boolean fileHidingEnabled) {
		this.fileHidingEnabled = fileHidingEnabled;
	}
	public Boolean getFileHidingEnabled() {
		return fileHidingEnabled;
	}
	public void setFileSelectionMode(Integer fileSelectionMode) {
		this.fileSelectionMode = fileSelectionMode;
	}
	public Integer getFileSelectionMode() {
		return fileSelectionMode;
	}
	public void setMultiSelectionEnabled(Boolean multiSelectionEnabled) {
		this.multiSelectionEnabled = multiSelectionEnabled;
	}
	public Boolean getMultiSelectionEnabled() {
		return multiSelectionEnabled;
	}
	public void setSelectedFile(String selectedFile) {
		this.selectedFile = selectedFile;
	}
	public String getSelectedFile() {
		return selectedFile;
	}
	public void setSelectedFiles(String selectedFiles) {
		this.selectedFiles = selectedFiles;
	}
	public String getSelectedFiles() {
		return selectedFiles;
	}
	public void setExpandsSelectedPaths(Boolean expandsSelectedPaths) {
		this.expandsSelectedPaths = expandsSelectedPaths;
	}
	public Boolean getExpandsSelectedPaths() {
		return expandsSelectedPaths;
	}
	public void setInvokesStopCellEditing(Boolean invokesStopCellEditing) {
		this.invokesStopCellEditing = invokesStopCellEditing;
	}
	public Boolean getInvokesStopCellEditing() {
		return invokesStopCellEditing;
	}
	public void setLargeModel(Boolean largeModel) {
		this.largeModel = largeModel;
	}
	public Boolean getLargeModel() {
		return largeModel;
	}
	public void setRootVisible(Boolean rootVisible) {
		this.rootVisible = rootVisible;
	}
	public Boolean getRootVisible() {
		return rootVisible;
	}
	public void setScrollsOnExpand(Boolean scrollsOnExpand) {
		this.scrollsOnExpand = scrollsOnExpand;
	}
	public Boolean getScrollsOnExpand() {
		return scrollsOnExpand;
	}
	public void setSelectionRow(Integer selectionRow) {
		this.selectionRow = selectionRow;
	}
	public Integer getSelectionRow() {
		return selectionRow;
	}
	public void setSelectionRows(String selectionRows) {
		this.selectionRows = selectionRows;
	}
	public String getSelectionRows() {
		return selectionRows;
	}
	public void setShowsRootHandles(Boolean showsRootHandles) {
		this.showsRootHandles = showsRootHandles;
	}
	public Boolean getShowsRootHandles() {
		return showsRootHandles;
	}
	public void setToggleClickCount(Integer toggleClickCount) {
		this.toggleClickCount = toggleClickCount;
	}
	public Integer getToggleClickCount() {
		return toggleClickCount;
	}
	public void setExtentSize(String extentSize) {
		this.extentSize = extentSize;
	}
	public String getExtentSize() {
		return extentSize;
	}
	public void setScrollMode(Integer scrollMode) {
		this.scrollMode = scrollMode;
	}
	public Integer getScrollMode() {
		return scrollMode;
	}
	public void setViewPosition(String viewPosition) {
		this.viewPosition = viewPosition;
	}
	public String getViewPosition() {
		return viewPosition;
	}
	public void setViewSize(String viewSize) {
		this.viewSize = viewSize;
	}
	public String getViewSize() {
		return viewSize;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPage() {
		return page;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentType() {
		return contentType;
	}
	public void setDragMode(Integer dragMode) {
		this.dragMode = dragMode;
	}
	public Integer getDragMode() {
		return dragMode;
	}
	public void setFocusLostBehavior(Integer focusLostBehavior) {
		this.focusLostBehavior = focusLostBehavior;
	}
	public Integer getFocusLostBehavior() {
		return focusLostBehavior;
	}
	public void setMaximumRowCount(Integer maximumRowCount) {
		this.maximumRowCount = maximumRowCount;
	}
	public Integer getMaximumRowCount() {
		return maximumRowCount;
	}
	public void setPopupVisible(Boolean popupVisible) {
		this.popupVisible = popupVisible;
	}
	public Boolean getPopupVisible() {
		return popupVisible;
	}
}