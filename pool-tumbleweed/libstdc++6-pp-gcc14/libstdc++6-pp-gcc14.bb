SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "libstdc++6-pp-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "463705199d96be3713dda57780e08ccede8abcfb1a1e0ecff808290b4b722891edc6265413ada23fb2a3339f76e2c0de1e45be52c1a2c2d3fc775ec116e0726f"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc14 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
