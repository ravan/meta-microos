SUMMARY = "Oxygen's KWin decoration"
DESCRIPTION = "This package contains the Oxygen's KWin decoration."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "oxygen6-decoration-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "a16a0ee718c531b0b5de6753458ac69b75fcdffb44daa2ebe39ab8316725fde490f0ac3620090b959ed506da1b48c5ddc8daadd1ee38028583a07d624e19d985"

RPROVIDES:${PN} += "oxygen-decoration5 \
oxygen5-decoration \
oxygen6-decoration"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkdecorations3.so.6 \
liboxygenstyle6.so.6 \
liboxygenstyleconfig6.so.6 \
libstdc++.so.6 \
libxcb.so.1 \
oxygen6-style"

inherit rpm
