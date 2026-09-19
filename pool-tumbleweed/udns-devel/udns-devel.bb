SUMMARY = "Development files for libudns"
DESCRIPTION = "UDNS is a stub DNS resolver library with ability to perform both \
synchronous and asynchronous DNS queries. \
 \
This package contains header files and documentation needed for writing \
or compiling programs that use UDNS."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6"

RPM_NAME = "udns-devel-0.6-1.9.aarch64.rpm"
RPM_HASH = "3fe11aacad3612235f899094b53d553748f8da01542a3b3d281503622feb103f86682835d0d8279d4d4b14c6467ce206672d61d833b619efb0aac421789a1ed8"

RPROVIDES:${PN} += "udns-devel"

RDEPENDS:${PN} += "libudns0"

inherit rpm
