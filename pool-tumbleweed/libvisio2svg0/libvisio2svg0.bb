SUMMARY = "Library to convert Visio Documents and Stencils (VSS and VSD) to SVG"
DESCRIPTION = "Library for conversion of Visio Documents and Stencils (VSS and VSD) to SVG. \
It can be used for conversion of standalone EMF files, but \
more typically for files embedded in other file formats, e.g. \
Visio drawings."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "libvisio2svg0-0.5.5-3.24.aarch64.rpm"
RPM_HASH = "ff40381a40c66df7d49f91678b532df51890432fd84914d712097943a9b4588b5775b612657891a09bdb6f5b20cd4b66d7f58d28f36c7d2a28640fce41959e9a"

RPROVIDES:${PN} += "libTitleGenerator.so.0 \
libVisio2Svg.so.0 \
libvisio2svg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libemf2svg.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libvisio-0.1.so.1 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libxml2.so.16"

inherit rpm
