SUMMARY = "Advanced Text Editor"
DESCRIPTION = "Kate is an advanced text editor by KDE."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kate-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "bd923c595e709b9861dcf4a8ac55f3d42794a8efe44260a6cd70241db6256a319b2664041eccab11ffdf4fd33869394f57a4cff13ded99c3016f266c7ee5241a"

RPROVIDES:${PN} += "kate \
kate5 \
libkateprivate.so.26.08.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
kate-plugins \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextEditor.so.6 \
libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
