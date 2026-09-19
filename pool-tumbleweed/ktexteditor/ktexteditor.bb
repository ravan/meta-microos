SUMMARY = "Embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "ktexteditor-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "e644cccd5d025a01f0949f7ab4ade0c55a19c4f5bf8ed97ecda60351a085be1f83307fff9c6eae4609151ee2b87ff3d9f9b32650ccd5056e99b004179a3fcad5"

RPROVIDES:${PN} += "ktexteditor \
libKF5TextEditor.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libeditorconfig.so.0 \
libm.so.6 \
libstdc++.so.6 \
syntax-highlighting"

inherit rpm
