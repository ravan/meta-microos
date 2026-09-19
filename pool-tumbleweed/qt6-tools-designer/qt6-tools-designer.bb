SUMMARY = "Qt graphical interface creation tool"
DESCRIPTION = "Qt Designer is a tool for designing and building graphical user interface \
with Qt Widgets."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-tools-designer-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "d4581ae5675e9249fad643227d431c2e1acb5cdc7d42ab9a2d4e36201b56c327e54857be1b83d916d868b408f6fed04485c1dafc80898ef22b9cb5f0cbce1ee6"

RPROVIDES:${PN} += "libcontainerextension.so \
libcustomwidgetplugin.so \
libqquickwidget.so \
libtaskmenuextension.so \
qt6-tools-designer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Designer.so.6 \
libQt6DesignerComponents.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
