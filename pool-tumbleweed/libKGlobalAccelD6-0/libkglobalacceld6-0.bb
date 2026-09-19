SUMMARY = "KGlobalAccelD library"
DESCRIPTION = "KGlobalAcceld is a daemon providing Global Keyboard Shortcut (Accelerator) \
functionality. \
This package provides the kglobalacceld library."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libKGlobalAccelD6-0-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "65946fdf3189ba8637ac55f1f4ccdc2566f3faaed1695b99ace80f307e1fa4e59cf63c591d582bc1a4fec5f2ecb23c19ad36a5f79e90ab02f38f08ab31dde21f"

RPROVIDES:${PN} += "libKGlobalAccelD.so.0 \
libKGlobalAccelD6-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Service.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
