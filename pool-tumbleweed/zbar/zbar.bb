SUMMARY = "Bar code reader"
DESCRIPTION = "ZBar reads bar codes from various sources, such as video streams, \
image files and raw intensity sensors. It supports many symbologies \
(types of bar codes) including EAN-13/UPC-A, UPC-E, EAN-8, Code 128, \
Code 39, Interleaved 2 of 5 and QR Code. \
 \
It can be used through the standalone GUI and command-line programs, \
or integrated by other programs through a library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.23.93"

RPM_NAME = "zbar-0.23.93-4.3.aarch64.rpm"
RPM_HASH = "66e85236900e59d2601cbd00c8d7d2ac1888f3ca65f2e4704568e17d3087b5a6259f271958ff39d8ad17318f77802587e60a068dca0a8cb984563b5d595840f2"

RPROVIDES:${PN} += "zbar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libzbar.so.0"

inherit rpm
