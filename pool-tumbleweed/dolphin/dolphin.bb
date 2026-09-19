SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the default file manager of KDE Workspaces."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "dolphin-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a4ec1a29c4015a9d538a7249c12e2c5d77cac1df63cb309ab3ac20410528ff4fa1e3566f7d4180ef5fa7b4dd3edd99fa49e371dc2fe67d802edb4fcb6f5ff373"

RPROVIDES:${PN} += "dolphin \
dolphin-zsh-completion"

RDEPENDS:${PN} += "/sbin/ldconfig \
dolphin-part \
kf6-baloo-kioslaves \
ld-linux-aarch64.so.1 \
libKF6Baloo.so.6 \
libKF6BalooWidgets.so.6 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libdolphinprivate.so.6 \
libpackagekitqt6.so.2 \
libstdc++.so.6"

inherit rpm
