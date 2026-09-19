SUMMARY = "Shared object for Qt5 hosts displaying X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* Qt5 hosts displaying x11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.22"

RPM_NAME = "suil-plugin-x11-in-qt5-0.10.22-1.6.aarch64.rpm"
RPM_HASH = "1ceb46ddba319038da171e4a6adbccb454d472f6771e5a0e489837f59960d7338c7ea4c3910d2606e9e53cc7014d17746f926373fe73f56574998d01a685ba9d"

RPROVIDES:${PN} += "libsuil-x11-in-qt5.so \
suil-plugin-x11-in-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsuil-0-0"

inherit rpm
