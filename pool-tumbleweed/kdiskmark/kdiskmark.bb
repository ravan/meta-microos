SUMMARY = "A simple open-source disk benchmark tool for Linux distros"
DESCRIPTION = "KDiskMark is an HDD and SSD benchmark tool with a very friendly graphical user interface."
LICENSE = "GPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "kdiskmark-3.3.0-1.2.aarch64.rpm"
RPM_HASH = "5e708e5a010380bdd0bc3f0abeef7755a7cca3b257ac23def8e832bb9f2898936f27fb88782c9e77e21474a44af0eeff43159c7ec1d12b5d3dd3c5d53b8a9de0"

RPROVIDES:${PN} += "bundled-singleapplication \
kdiskmark"

RDEPENDS:${PN} += "fio \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpolkit-qt6-core-1.so.1 \
libstdc++.so.6"

inherit rpm
