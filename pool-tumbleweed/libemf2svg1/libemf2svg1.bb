SUMMARY = "EMF (Enhanced Metafile) to SVG conversion library"
DESCRIPTION = "Library for converting Enhanced Metafile (EMF and EMF+) files to the \
SVG format. It can be used for conversion of standalone EMF files, \
but more typically for files embedded in other file formats, e.g. \
Visio drawings."
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "libemf2svg1-1.1.0-2.26.aarch64.rpm"
RPM_HASH = "fef98aed95c678380c63e87f4f24b82e08590d50259e0660a0c2583f9f583fe8735fbca348da30005ed7155d18b5311dc2166153563ce9574364c35f468fc095"

RPROVIDES:${PN} += "libemf2svg.so.1 \
libemf2svg1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
