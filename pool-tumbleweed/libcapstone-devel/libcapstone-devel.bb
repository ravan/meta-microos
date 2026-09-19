SUMMARY = "Development files to build upon libcapstone"
DESCRIPTION = "Development files to build upon libcapstone, C language only."
LICENSE = "BSD-3-Clause"

PV = "5.0.6"

RPM_NAME = "libcapstone-devel-5.0.6-2.3.aarch64.rpm"
RPM_HASH = "ce1c78264434db0d35bb40ee49baff9890e0d01e54139b24299e36121dc54eeb743459032bd560fb0c83f2d287dbfabbae7d785131a1fe2618e2eadee691dce6"

RPROVIDES:${PN} += "cmake-capstone \
libcapstone-devel \
pkgconfig-capstone"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcapstone5"

inherit rpm
