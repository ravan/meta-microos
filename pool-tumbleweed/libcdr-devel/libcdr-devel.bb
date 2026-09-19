SUMMARY = "Files for Developing with libcdr"
DESCRIPTION = "libcdr is a library for parsing the Corel Draw file format structure. \
 \
This package contains the libcdr development files."
LICENSE = "MPL-2.0"

PV = "0.1.9"

RPM_NAME = "libcdr-devel-0.1.9-1.3.aarch64.rpm"
RPM_HASH = "e50dfbfcea27d8340f4fd4813c5277ba7a415e8e3ec842757efc46145bc35de425458dbfa1db5ee258388e0a8511d87179b0b991bba0587bca4fbfab00cd10fc"

RPROVIDES:${PN} += "libcdr-devel \
pkgconfig-libcdr-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdr-0-1-1 \
pkgconfig-icu-i18n \
pkgconfig-lcms2 \
pkgconfig-librevenge-0.0 \
pkgconfig-zlib"

inherit rpm
