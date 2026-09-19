SUMMARY = "Version control plugins for Dolphin"
DESCRIPTION = "Dolphin file manager specific version control plugins that: \
- Show the version state of a file by an emblem + color \
- Provide a context menu with version control specific actions \
- Provide context menu actions to mount ISO disk images"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "dolphin-plugins-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c0edf3e11a4997ca24fb0b14a55e31eae7d9dfe31a9406b62a8df7d9cd88a98ed0dc994d52366c2e37f7699be62a8b56cb4f0029db12a18d1a97c77873072cf3"

RPROVIDES:${PN} += "dolphin-plugins"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6TextEditor.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdolphinvcs.so.6 \
libstdc++.so.6"

inherit rpm
