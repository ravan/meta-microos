SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "libstdc++6-pp-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "0ff7a5ff2be6165b8f78aebf9552e72df8b95c3b8ac050acd9e23641c24aa090a6e8366e43d3140ec42a509293583a162c148da4068413fb1cc1e2d6c6cf8d1b"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc13 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
