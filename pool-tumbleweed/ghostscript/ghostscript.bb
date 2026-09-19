SUMMARY = "The Ghostscript interpreter for PostScript and PDF"
DESCRIPTION = "Ghostscript is a package of software that provides: \
 \
An interpreter for the PostScript language, with the ability to convert \
PostScript language files to many raster formats, view them on displays, and \
print them on printers that don't have PostScript language capability built in. \
 \
An interpreter for Portable Document Format (PDF) files, with the same \
abilities. \
 \
The ability to convert PostScript language files to PDF (with some limitations) \
and vice versa. \
 \
A set of C procedures (the Ghostscript library) that implement the graphics and \
filtering (data compression / decompression / conversion) capabilities that \
appear as primitive operations in the PostScript language and in PDF. \
 \
For information how to use Ghostscript see \
/usr/share/ghostscript/10.07.1/doc/Use.htm"
LICENSE = "AGPL-3.0-only"

PV = "10.07.1"

RPM_NAME = "ghostscript-10.07.1-1.3.aarch64.rpm"
RPM_HASH = "0591fcab528be5ae22b25ad699cfbcd76a13d54fbc8cd8d1c09c261155fbf81576194bce9702a42b4bb7f1b84a8fdd447afc87b8186f59e2638cf5a60b9c4745"

RPROVIDES:${PN} += "10.07.1 \
ghostscript \
ghostscript-any \
ghostscript-library \
gs \
gs-lib \
libgs.so.10 \
libijs-0.35.so \
pstoraster"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libfreetype.so.6 \
libjpeg.so.8 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libtiff.so.6 \
libz.so.1"

inherit rpm
