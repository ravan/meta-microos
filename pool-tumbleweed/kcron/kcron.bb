SUMMARY = "Cron job configuration tool"
DESCRIPTION = "KCron allows you to change your cron jobs setup."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kcron-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "92e46d6217eb79283190653ab396f7f86c1c9eb1a5ccf7bb05389dd7b592ac16f14f877adc99d2f57024c6c99281f1f8a0d7ddfb9c842c192781813cd02ed5af"

RPROVIDES:${PN} += "kcron \
kcron5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
