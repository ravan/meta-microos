SUMMARY = "Files for Developing with libvisio"
DESCRIPTION = "libvisio is a library for parsing the MS Visio file format structure. It is \
cross-platform, at the moment it can be build on Microsoft Windows and Linux. \
 \
This package contains the libvisio development files."
LICENSE = "MPL-2.0"

PV = "0.1.11"

RPM_NAME = "libvisio-devel-0.1.11-1.3.aarch64.rpm"
RPM_HASH = "9767142915913802dd5b9ce86a5832ef8ea9e7fffdcb26093fa18188c298969b746544c0cda453c9a63cb53b3b8007ef9793f9e78042aaccdf66d92e33886ac2"

RPROVIDES:${PN} += "libvisio-devel \
pkgconfig-libvisio-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvisio-0-1-1 \
pkgconfig-icu-i18n \
pkgconfig-librevenge-0.0 \
pkgconfig-libxml-2.0"

inherit rpm
