SUMMARY = "Display gamma configuration"
DESCRIPTION = "This package contains a KDE system settings module to configure display \
gamma."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kgamma6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "8da840cccd028e3d62bc1b53ed56b180b8946fe26185f843509f007d896354ed4f8b7ce21322370a3d66c6c81cfec3cff56c90fb533b21d6a5ef49ac505df9f1"

RPROVIDES:${PN} += "kgamma \
kgamma5 \
kgamma6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
