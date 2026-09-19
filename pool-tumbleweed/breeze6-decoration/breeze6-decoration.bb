SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze KWin decoration."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "breeze6-decoration-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "146bc7a703ae743d551a410692916201a9e302dce3d4e25fed7cca8c39f694513b486d8599fb387c530dc29eb1bcac74889d71bc9f10b9182bff41c8d0eba78c"

RPROVIDES:${PN} += "breeze6-decoration"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkdecorations3.so.6 \
libstdc++.so.6"

inherit rpm
