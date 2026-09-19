SUMMARY = "Messageviewer header theme editor based on Grantlee"
DESCRIPTION = "A theme editor for messageviewer based on Grantlee. Once created or modified, \
the themes can be used in KMail."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "grantlee-editor-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2183dd95bca95e76bd9626b559beee067cc51963e6cff1146598b34b04f939d0c5e93045bde50b9660df98772a5c088a2da341f526d3ccfabd836b97ff59da64"

RPROVIDES:${PN} += "grantlee-editor \
libgrantleethemeeditor.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kaddressbook \
kmail-application-icons \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextCustomEditor.so.1 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6GrantleeTheme.so.6 \
libKPim6MessageViewer.so.6 \
libKPim6PimCommon.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
