SUMMARY = "Development files for libmicrodns"
DESCRIPTION = "The libmicrodns-devel package contains libraries and header files for \
developing applications that use libmicrodns."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0+6"

RPM_NAME = "libmicrodns-devel-0.2.0+6-2.13.aarch64.rpm"
RPM_HASH = "ebef5730f605d8d001b9cdeb3b00e23f799f1bf2941ef30482192a976b4a4a087527cb28f420d593794442880860a785cf47664e09bc4d93ec7d77fc9f1873f8"

RPROVIDES:${PN} += "libmicrodns-devel \
pkgconfig-microdns"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmicrodns1"

inherit rpm
