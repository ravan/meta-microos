SUMMARY = "Graphic Converter"
DESCRIPTION = "TransFig is a set of tools for creating TeX documents with graphics \
that are portable in the sense that they can be printed in a wide \
variety of environments. \
 \
The transfig directory contains the source for the transfig command \
which generates a Makefile which translates Fig code to various \
graphics description languages using the fig2dev program.  In previous \
releases, this command was implemented as a shell script."
LICENSE = "MIT"

PV = "3.2.9a"

RPM_NAME = "transfig-3.2.9a-3.7.aarch64.rpm"
RPM_HASH = "012212dbc6d09390a824c1cac9e4e2ad3ca0a5b1201b8bd94c32a6d3126ec59475fdd37d0e47ca6d2ff99a0367ebfb63ff1ebde6d309cbeaedf6c0afde73508b"

RPROVIDES:${PN} += "fig2dev \
transfig"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1 \
netpbm"

inherit rpm
