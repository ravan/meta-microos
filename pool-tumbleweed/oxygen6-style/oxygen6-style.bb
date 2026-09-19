SUMMARY = "Oxygen style for Qt 6"
DESCRIPTION = "This package contains the libraries of the Oxygen style for Qt 6."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "oxygen6-style-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "0fe4a117bb171973cfbfbafcda61902b2113d9947fc75b4b1cd10e3b66b63aa265f92ab69dc8456ba7c09df9d9847afe92812ca14915b1b83f2ece9bc03aed7f"

RPROVIDES:${PN} += "liboxygenstyle6.so.6 \
liboxygenstyleconfig6.so.6 \
oxygen-style5 \
oxygen5-style \
oxygen6-style"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6Style.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
