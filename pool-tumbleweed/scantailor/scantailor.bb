SUMMARY = "Interactive post-processing tool for scanned pages"
DESCRIPTION = "Scan Tailor is an interactive post-processing tool for scanned pages. \
It performs operations such as page splitting, deskewing, \
adding/removing borders and others. It takes raw scans, and outputs \
pages ready to be printed or assembled into a PDF or DJVU file."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.16"

RPM_NAME = "scantailor-1.0.16-3.10.aarch64.rpm"
RPM_HASH = "0bb04532cb05099112401eab7ab79acc87f26a68460020b04857430a3b0d4dce5499f988235863273fbae22814cfbf0ac3290023bf80e857638a77d63c4dc404"

RPROVIDES:${PN} += "scantailor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
