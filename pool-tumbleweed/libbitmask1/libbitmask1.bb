SUMMARY = "Multi-word bitmask abstract data type (used by cpusets)"
DESCRIPTION = "The Cpuset System is a processor and memory placement mechanism that \
The libbitmask package provides an abstract data type for arbitrary \
length bit masks, with a variety of operators.	The cpuset package \
depends on libbitmask."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "libbitmask1-2.0-29.17.aarch64.rpm"
RPM_HASH = "47c45dc352f0d5cef0ee25b3b4e297574d98f38bd85e7247e258a3a80f424443072240095e2acef0ec57e32dabf27a65e28fdc9fa254745b8077eca03f4ac2f4"

RPROVIDES:${PN} += "libbitmask.so.1 \
libbitmask1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
