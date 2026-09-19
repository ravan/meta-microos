SUMMARY = "Barcode generator library"
DESCRIPTION = "Zint is a C library for encoding data in several barcode variants. The \
bundled command-line utility provides a simple interface to the library. \
Features of the library: \
- Over 50 symbologies including all ISO/IEC standards, like QR codes. \
- Unicode translation for symbologies which support Latin-1 and \
  Kanji character sets. \
- Full GS1 support including data verification and automated insertion of \
  FNC1 characters. \
- Support for encoding binary data including NULL (ASCII 0) characters. \
- Health Industry Barcode (HIBC) encoding capabilities. \
- Output in PNG, EPS and SVG formats with user adjustable sizes and colors. \
- Verification stage for SBN, ISBN and ISBN-13 data."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.0"

RPM_NAME = "zint-2.16.0-2.1.aarch64.rpm"
RPM_HASH = "e9b3a84b1fd3376ee1138ab3f94ff3965c2f01bce65c7e95537a2dcc51b7d8fa000f64e3d61039b93afdb13fef1488c940b1726d7d7f538562af6ee37ecf662a"

RPROVIDES:${PN} += "zint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzint.so.2.16"

inherit rpm
