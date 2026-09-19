SUMMARY = "Vacuum-IM application statistics collection plugin"
DESCRIPTION = "This plugin needed to collect application statistics."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1639054987.g0abd5e1"

RPM_NAME = "vacuum-im-plugins-statistics-1.3.0+git1639054987.g0abd5e1-1.9.aarch64.rpm"
RPM_HASH = "1cbfafb20cfebd2093079f28474ee7a6bb515f36c5949f04d4f4232166a72fafc66b3cd1240cc9f2304ad5231c20efb24bca4a1e1a29c3b4ad2559abe2623a08"

RPROVIDES:${PN} += "libstatistics.so \
vacuum-im-plugins-statistics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37 \
libvacuumutils37 \
vacuum-im"

inherit rpm
