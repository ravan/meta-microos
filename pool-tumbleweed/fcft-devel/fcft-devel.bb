SUMMARY = "Header files for fcft,  a font loading and rasterization library"
DESCRIPTION = "fcft is a font loading and glyph rasterization library built on-top \
of FontConfig, FreeType2 and pixman."
LICENSE = "MIT"

PV = "3.3.3"

RPM_NAME = "fcft-devel-3.3.3-1.4.aarch64.rpm"
RPM_HASH = "d730f20b1324966278d892037f975b6668fd4a1648e12c21061c37c4f4b9854eaddb858f5089756c181fd99a30295f30004b9c110c1449dceeca3969dc600a00"

RPROVIDES:${PN} += "fcft-devel \
pkgconfig-fcft"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfcft4 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-harfbuzz \
pkgconfig-libutf8proc \
pkgconfig-pixman-1 \
pkgconfig-tllist"

inherit rpm
