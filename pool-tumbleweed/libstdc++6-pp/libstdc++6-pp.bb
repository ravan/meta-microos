SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "libstdc++6-pp-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "2d81fc5f0493fe14a53302c2f11b362c875e7b675843a7b43daf1225b85135fb72dc8cc4cade0feb6805829b487b8cc9e7e83e8793051ab0bb113b2c1e2d625a"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
