SUMMARY = "KDE Text Editor plugins"
DESCRIPTION = "Kate is an advanced text editor by KDE. This package contains \
plugins and data files for Kate and KWrite editors."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kate-plugins-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e6a87ac545f6144903818aec07955b1efd295e7769e15721244c38f68b3a1965d5995502164a59bc84795ad23c933da425640341ac452fed2760d6bf93cd1d92"

RPROVIDES:${PN} += "kate-plugins \
ktexteditorpreviewplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextEditor.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libkateprivate.so.26.08.1 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
