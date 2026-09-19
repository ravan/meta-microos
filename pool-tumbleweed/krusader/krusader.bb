SUMMARY = "Twin panel file manager for KDE Plasma and other desktops"
DESCRIPTION = "Krusader is an advanced twin panel (commander style) file manager for KDE Plasma \
and other desktops in the *nix world."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.0"

RPM_NAME = "krusader-2.9.0-1.6.aarch64.rpm"
RPM_HASH = "12af3198a20093c800e881d4b31d31e24bab66a0f9f2dced3fd0a0bd1616707efe775b1f3a1b1a21ba351751fdffcc3b34bfb1d3da96fb775369a3d0a463ef53"

RPROVIDES:${PN} += "krusader"

RDEPENDS:${PN} += "kio-iso \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemViews.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextWidgets.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
