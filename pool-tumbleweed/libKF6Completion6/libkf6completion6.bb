SUMMARY = "Widgets with advanced completion support"
DESCRIPTION = "KCompletion provides widgets with advanced completion support as well as a \
lower-level completion class which can be used with your own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Completion6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "ea0fabaa9cae4fe56648deec7a693378379b6e741db01c2edc961d2b960ade169a78d2fd0f970991165394422ce01595121bb33de0eba979305e0c8148c0ab4b"

RPROVIDES:${PN} += "libKF6Completion.so.6 \
libKF6Completion6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kcompletion \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
