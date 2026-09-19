SUMMARY = "PDF and XPS Viewer and Parser and Rendering Library"
DESCRIPTION = "MuPDF is a PDF and XPS viewer and parser/rendering library. \
 \
The renderer in MuPDF is tailored for anti-aliased graphics. It \
renders text with metrics and spacing accurate to within fractions of \
a pixel for reproducing the look of a printed page on screen. \
 \
MuPDF supports PDF 1.7 with transparency, encryption, hyperlinks, \
annotations and search. MuPDF can also read XPS documents \
(OpenXPS/ECMA-388)."
LICENSE = "AGPL-3.0-or-later"

PV = "1.28.3"

RPM_NAME = "mupdf-1.28.3-1.1.aarch64.rpm"
RPM_HASH = "7c7800cb0594a4413073ce5c4549a549e22d791c1ef928115c24644b7d9617f66c1bb40f0264d36bf885c6c4ff26d42a35f9145374dc93f26cb4f9bf1bdf3a6a"

RPROVIDES:${PN} += "bundled-freeglut \
bundled-freeglut-art \
bundled-gumbo-parser \
bundled-lcms2 \
bundled-lcms2-art \
bundled-mujs \
mupdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libmupdf.so.28.3 \
xdg-utils"

inherit rpm
