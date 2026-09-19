SUMMARY = "Versatile Font Library"
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

RPM_NAME = "VFlib3-3.7.2-4.5.aarch64.rpm"
RPM_HASH = "84cb7baff030593414da8af926bcd0f90f237b3b4ad8150dfdcae8a152c866b29d89067a828a6b6ffa49d5cecf43ede9b8feb4c365813d97c9410d87aeca39f4"

RPROVIDES:${PN} += "VFlib3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libVFlib3.so.10 \
libX11.so.6 \
libc.so.6 \
libkpathsea.so.6"

inherit rpm
