SUMMARY = "Qt 5 QtTools Module"
DESCRIPTION = "The QtTools modules contains some tools mostly useful for application development. \
 \
Included are QtAssistant (help browser), QtDesigner (GUI design), QDbusViewer \
and several more."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qttools-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "794068fe8df7ac2ca4a2c357090c2afbd685b421acbede445ccf7389364939643c3813f296007222c9fef9fd1ae2a7de2d0ccbd3f62cb925b12174e21d1202ca"

RPROVIDES:${PN} += "cmake-Qt5AttributionsScannerTools \
libqquickwidget.so \
libqt5-qttools"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5Designer.so.5 \
libQt5DesignerComponents.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libqt5-qdbus \
libqt5-qtpaths \
libqt5-qttools-qhelpgenerator \
libstdc++.so.6"

inherit rpm
