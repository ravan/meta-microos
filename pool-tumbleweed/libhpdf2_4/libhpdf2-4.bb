SUMMARY = "Library for generating PDF files"
DESCRIPTION = "libHaru is a library for generating PDF files. \
It supports the following features: \
- Generating PDF files with lines, text, images. \
- Outline, text annotation, link annotation. \
- Compressing document with deflate-decode. \
- Embedding PNG, JPEG images. \
- Embedding Type1 font and TrueType font. \
- Creating encrypted PDF files. \
- Using various character sets (ISO8859-1~16, MSCP1250~8, KOI8-R). \
- CJK fonts and encodings."
LICENSE = "Zlib"

PV = "2.4.6"

RPM_NAME = "libhpdf2_4-2.4.6-1.1.aarch64.rpm"
RPM_HASH = "0fd14bf3586299fdd979710e2a5a94a54118c5e5dbbdcc5283cefa30819a38a3cf90cd07fdb4d5c7f793abff8e9920d3276d251a1d38c0649edc04ba00ae81cd"

RPROVIDES:${PN} += "libhpdf.so.2.4 \
libhpdf2-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
