SUMMARY = "Headers for libxlsxwriter"
DESCRIPTION = "Libxlsxwriter is a C library for creating Excel XLSX files. \
 \
This package holds the development files."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "libxlsxwriter-devel-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "9756d92db3f36d1365eccc11c77a73d7da06c2b0a8e99dd4f2bb83b5da817f5581fe3fbf6beb6cfc34697d7af682bc4f6a440ad530ec0bb12af537ed5084934e"

RPROVIDES:${PN} += "libxlsxwriter-devel \
pkgconfig-xlsxwriter"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxlsxwriter9 \
pkgconfig-minizip \
pkgconfig-zlib"

inherit rpm
