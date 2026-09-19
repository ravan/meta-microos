SUMMARY = "Development files for libbaseencode"
DESCRIPTION = "Pkg-config and header files for developing applications that use libbaseencode"
LICENSE = "Apache-2.0"

PV = "1.0.15"

RPM_NAME = "libbaseencode-devel-1.0.15-1.11.aarch64.rpm"
RPM_HASH = "f4c51d7087bf5a84fdbfdbd08e99338d130704cd076d5de348ff9468ced4d2aff48a048b941f9620378eadd06292602d89e8b7b014bd33645a8955fda3da5c4b"

RPROVIDES:${PN} += "libbaseencode-devel \
pkgconfig-baseencode"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbaseencode1"

inherit rpm
