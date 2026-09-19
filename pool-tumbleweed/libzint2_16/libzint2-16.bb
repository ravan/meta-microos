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

RPM_NAME = "libzint2_16-2.16.0-2.1.aarch64.rpm"
RPM_HASH = "a0f3aea63e4f765028a9bb2f40a48b32065655f75bd3b1680573677dde7e60c78e0ae6ca160ea53373034f769a352a3591570078015907f29d8fa8beacfff920"

RPROVIDES:${PN} += "libzint.so.2.16 \
libzint2-16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
