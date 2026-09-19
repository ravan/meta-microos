SUMMARY = "Embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF6::TextEditor library."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6TextEditor6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "b3e3b5c7a97f5a26d0e60172942a1f3d33a2b5ab4ba6b17031619f49ea0ce7e29f66965367a0e2874da819715fa8632d8b15d8995706e25ab99a000e1762f107"

RPROVIDES:${PN} += "libKF6TextEditor.so.6 \
libKF6TextEditor6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-ktexteditor \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libeditorconfig.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
