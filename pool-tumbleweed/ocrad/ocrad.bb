SUMMARY = "Optical Character Recognition Program"
DESCRIPTION = "GNU Ocrad is an OCR (Optical Character Recognition) program based on a feature \
extraction method. It reads images in pbm (bitmap), pgm (greyscale) or ppm \
(color) formats and produces text in byte (8-bit) or UTF-8 formats. \
 \
Also includes a layout analyser able to separate the columns or blocks of text \
normally found on printed pages. \
 \
Ocrad can be used as a stand-alone console application, or as a backend to \
other programs."
LICENSE = "GPL-2.0-or-later"

PV = "0.29"

RPM_NAME = "ocrad-0.29-1.11.aarch64.rpm"
RPM_HASH = "617dfbca637d5ffa14a74e6ebbd9266e03365cca3f517bdd8071515c7a580c8aad210ed882a1cfe0908843435f04694a29e6c08f07034e1b3acb8799c1fb1a05"

RPROVIDES:${PN} += "ocrad"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
