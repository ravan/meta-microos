SUMMARY = "PDF Rendering Library Tools"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "poppler-tools-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "4925b6f50fbf90d042c451ac6c21a1185307253e50f9a47469b4c943399c9f83cc4e9aabe74953e7950b189a5318fa66d6ea467d0eef94d527c7d64be451449f"

RPROVIDES:${PN} += "pdfattach \
pdfdetach \
pdffonts \
pdfimages \
pdfinfo \
pdfseparate \
pdfsig \
pdftocairo \
pdftohtml \
pdftoppm \
pdftops \
pdftotext \
pdfunite \
poppler-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
liblcms2.so.2 \
libm.so.6 \
libpoppler.so.162 \
libpoppler162 \
libstdc++.so.6"

inherit rpm
