SUMMARY = "Development files for libdeflate"
DESCRIPTION = "The libdeflate-devel package contains libraries and header files for \
developing applications that use libdeflate."
LICENSE = "BSD-2-Clause"

PV = "1.25"

RPM_NAME = "libdeflate-devel-1.25-1.4.aarch64.rpm"
RPM_HASH = "6cfa86c65bbf933cf7c992ab23768bdad70a2da1d7a0ecc47751743c8b9019e1d0383c7ff1a250128db098e04a72db6c0cd44029121fa95b14fc62bccc434b1a"

RPROVIDES:${PN} += "cmake-libdeflate \
libdeflate-devel \
pkgconfig-libdeflate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdeflate0"

inherit rpm
