SUMMARY = "A software to remove unnecessary data from SVG files"
DESCRIPTION = "Svgcleaner reduces the size of an SVG image by removing useless data such as \
- temporary data used by the vector editing application \
- non-optimal SVG structure representation \
- unused and invisible graphical elements"
LICENSE = "GPL-2.0-only"

PV = "0.9.5"

RPM_NAME = "svgcleaner-0.9.5-4.7.aarch64.rpm"
RPM_HASH = "bbe3b9659cd14b9e94b4eafb4173a5820e0d526c36371f7c69bd8598c9cdefbf02e6ee075aed2ab567a9765f1b8029fa9d5558a8152df930dc095b37445bba32"

RPROVIDES:${PN} += "svgcleaner"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
p7zip \
svgcleaner-gui"

inherit rpm
