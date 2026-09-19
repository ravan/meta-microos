SUMMARY = "Development files for libdatachannel"
DESCRIPTION = "The libdatachannel-devel package contains libraries and header files for \
developing applications that use libdatachannel."
LICENSE = "MPL-2.0"

PV = "0.24.5"

RPM_NAME = "libdatachannel-devel-0.24.5-1.1.aarch64.rpm"
RPM_HASH = "913b62eb1b49cbf3663ce3254d32c1918f857baf9fee9a01bb45d1668802ea1cd29daecb60f6f1d5d6a440c4b6773a54edf99d87ae04a791d935855a66a5c0cf"

RPROVIDES:${PN} += "cmake-LibDataChannel \
libdatachannel-devel"

RDEPENDS:${PN} += "libdatachannel0-24"

inherit rpm
