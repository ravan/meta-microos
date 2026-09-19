SUMMARY = "Collection of video sources and filters plugins"
DESCRIPTION = "This package provides a collection of video sources and filters plugins, \
using the Frei0r API."
LICENSE = "GPL-3.0-or-later"

PV = "3.5.0"

RPM_NAME = "frei0r-plugins-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "8491791925842676344301f837904a8bd25c433769344577290b3369828a9c0529d26618cb0944cdf3cd21bd852bc7085a8cb22f3870b7eca9d5b901415a60fb"

RPROVIDES:${PN} += "frei0r-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgavl.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
