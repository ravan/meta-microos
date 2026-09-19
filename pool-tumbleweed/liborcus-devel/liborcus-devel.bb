SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Standalone file import filter library for spreadsheet documents. Currently \
under development are ODS, XLSX and CSV import filters."
LICENSE = "MPL-2.0"

PV = "0.21.0"

RPM_NAME = "liborcus-devel-0.21.0-1.4.aarch64.rpm"
RPM_HASH = "c1cadf266d9abec1766e1c51381f8056719baeb312d1f8a0f9adaf0c452612a862c69d830cf54c0414d0c1b47dbf9c53a14579cce9098a47291415e6660f09e6"

RPROVIDES:${PN} += "liborcus-devel \
pkgconfig-liborcus-0.21 \
pkgconfig-liborcus-spreadsheet-model-0.21"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liborcus-0-21-0 \
pkgconfig-zlib"

inherit rpm
