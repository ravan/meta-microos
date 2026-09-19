SUMMARY = "Program for producing font samples"
DESCRIPTION = "fntsample is a program for making font samples that show Unicode coverage of \
the font. The samples are similar in appearance to Unicode charts. \
 \
Features: \
* Support for various font formats using FreeType library, including TrueType, \
  OpenType, and Type1. \
* Creation of samples in PDF and PostScript format. \
* Addition of outlines with Unicode block names for PDF samples. \
* Selection of code ranges to show in charts. \
* Comparisons of two font files with highlighting of added glyphs."
LICENSE = "CC-PDDC & GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "fntsample-5.4-1.11.aarch64.rpm"
RPM_HASH = "2c481314d9470383a972d8eaff1997a59f39b06fa250f2b8f8a3705e3da06ba985f4eb88ee10e718e29e21d759ca5439610335b6e5ffc2a0951b3d4d59f979b5"

RPROVIDES:${PN} += "fntsample"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
unicode-blocks"

inherit rpm
