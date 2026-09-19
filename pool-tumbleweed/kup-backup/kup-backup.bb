SUMMARY = "Backup scheduler for the Plasma desktop"
DESCRIPTION = "Kup is created for helping people to keep up-to-date backups of their personal files. \
Connecting a USB hard drive is the primary supported way to store files, but saving \
files to a server over a network connection is also possible for advanced users. \
 \
When you plug in your external hard drive Kup will automatically start copying your \
latest changes, but of course it will only do so if you have been active on your \
computer for some number of hours since the last time you took a backup (and it can \
of course ask you first, before copying anything). In general Kup tries to not \
disturb you needlessly."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "kup-backup-0.10.0-2.5.aarch64.rpm"
RPM_HASH = "c8c1d55c5c5d1a0bfbb005376e31801dfc199d473463c7974c393e89743d6ccd7568dfe19acf6176e30ff0f5788889bd8a41da3a55595ddd91007fc41c3eacd2"

RPROVIDES:${PN} += "kup-backup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Solid.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libPlasma5Support.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgit2.so.1.9 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.plasma5support \
qt6qmlimport-org.kde.plasma.plasmoid \
systemsettings6"

inherit rpm
