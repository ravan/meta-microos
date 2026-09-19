SUMMARY = "Shared object for Qt5 hosts displaying X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* Qt6 hosts displaying x11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.22"

RPM_NAME = "suil-plugin-x11-in-qt6-0.10.22-1.6.aarch64.rpm"
RPM_HASH = "4424f315475c4a4cdf2c3cb30be1042055a177b2fb834e31f15da3c74d0e94386716cc15538eb16e45df1c8360ee253c1f03a4b7f53bc5f9973ebaad1e868aa4"

RPROVIDES:${PN} += "libsuil-x11-in-qt6.so \
suil-plugin-x11-in-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsuil-0-0"

inherit rpm
