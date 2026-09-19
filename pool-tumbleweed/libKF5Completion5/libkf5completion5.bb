SUMMARY = "Widgets with advanced completion support"
DESCRIPTION = "KCompletion provides widgets with advanced completion support as well as a \
lower-level completion class which can be used with your own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Completion5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "32c4e1bb4121a3539ea5b1369009f4d146d8618633b17024d5e19f71044ddbc4d9d9eeb0975d10d8db2a19b2929b8eda45b02d85d628f5ef737a00d00f16e9b4"

RPROVIDES:${PN} += "libKF5Completion.so.5 \
libKF5Completion5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
