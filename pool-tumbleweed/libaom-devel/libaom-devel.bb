SUMMARY = "Development files for libaom, an AV1 codec library"
DESCRIPTION = "This package contains the development headers and library files for \
libaom, a library for the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.13.1"

RPM_NAME = "libaom-devel-3.13.1-2.5.aarch64.rpm"
RPM_HASH = "27d769bbb0243e6b6ee5394b1797272007605989218d90e93fef2cf7ee63d367e89ae25f957c9058894fef2ec172637a6cae40d765cdf9cbfab97067839b592d"

RPROVIDES:${PN} += "cmake-AOM \
libaom-devel \
pkgconfig-aom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
aom-tools \
libaom3 \
pkgconfig-libvmaf"

inherit rpm
