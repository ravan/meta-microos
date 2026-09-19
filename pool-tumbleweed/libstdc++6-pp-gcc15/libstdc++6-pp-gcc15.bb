SUMMARY = "GDB pretty printers for the C++ standard library"
DESCRIPTION = "This package contains pretty printers for the C++ standard library usable \
from GDB."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "libstdc++6-pp-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "7f5c19e5ef2450ce1b5e7f07083b3f33d4603f79915552c646d9c9ef58505e829e9c0b9f6bbd9d8f5745b96a3bd21fe77a8aa4f73565c19e2c93936a0af648df"

RPROVIDES:${PN} += "libstdc++6-pp \
libstdc++6-pp-gcc10 \
libstdc++6-pp-gcc11 \
libstdc++6-pp-gcc15 \
libstdc++6-pp-gcc9"

RDEPENDS:${PN} += "libstdc++6"

inherit rpm
