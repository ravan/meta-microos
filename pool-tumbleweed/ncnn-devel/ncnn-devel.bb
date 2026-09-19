SUMMARY = "Development tools for ncnn"
DESCRIPTION = "The ncnn-devel package contains the header files for ncnn."
LICENSE = "BSD-2-Clause & BSD-3-Clause & Zlib"

PV = "20250916"

RPM_NAME = "ncnn-devel-20250916-1.12.aarch64.rpm"
RPM_HASH = "d4787123a387fd302b0f222cd0d9f06c18ee43ea479ffc2863e83d48351965b33d47bb08765dd33fb2ba158eeb1f047566b842daaa8e36b09af1213b6645acac"

RPROVIDES:${PN} += "cmake-ncnn \
ncnn-devel \
pkgconfig-ncnn"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libncnn1"

inherit rpm
