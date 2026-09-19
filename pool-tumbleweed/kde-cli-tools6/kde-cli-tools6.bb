SUMMARY = "Additional CLI tools for KDE applications"
DESCRIPTION = "Additional CLI tools for KDE applications and workspaces."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kde-cli-tools6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "b3e6e26561bf72c1509bf730a5e545a15ec82262f9b1daa87e1c24412e572749287fa2178d31853184eb661f708dd5d81a2acc67515c09e7b9b06218a0d5d162"

RPROVIDES:${PN} += "kde-cli-tools5 \
kde-cli-tools6"

RDEPENDS:${PN} += "/usr/bin/sh \
kf6-kdbusaddons-tools \
ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6Su.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
