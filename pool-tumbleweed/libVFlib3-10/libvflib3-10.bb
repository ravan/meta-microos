SUMMARY = "Versatile font library VFlib3"
DESCRIPTION = "VFlib is a font library written in C language with several functions to \
obtain bitmaps of fonts. A unique feature of VFlib is that fonts in \
different formats are accessed by unified interface. \
 \
VFlib supports the following font formats: \
* TeX fonts: PK, GF, VF, TFM Omega \
* TeX fonts: OFM (level 0), OVF \
* X Window fonts: PCF, BDF. \
* Other fonts: TrueType, Type 1, HBF, Syotai Club, JG, ekanji"
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.2"

RPM_NAME = "libVFlib3-10-3.7.2-4.5.aarch64.rpm"
RPM_HASH = "1243120e6ce587ac3b8781bb1f3c8c0c372d1af12fc44cd6ad5d1d6ddfbb55b59ef5dd8967e513e5a9aee04f8af9c2556c786fb12d6daf519a86f00b8f350776"

RPROVIDES:${PN} += "libVFlib3-10 \
libVFlib3.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libkpathsea.so.6 \
libm.so.6"

inherit rpm
