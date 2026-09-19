SUMMARY = "Qt version of Zint library"
DESCRIPTION = "Qt version of Zint library."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.0"

RPM_NAME = "libQZint2_16-2.16.0-2.1.aarch64.rpm"
RPM_HASH = "c7b11e630a6acbc62ab95ea92026056b706e0d1428c6811378da84bb7239215c1b52b1cae616121b5558f0bba6153c15ccc20d95fbd401dc36b8ca8719dd848e"

RPROVIDES:${PN} += "libQZint.so.2.16 \
libQZint2-16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzint.so.2.16"

inherit rpm
