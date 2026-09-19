SUMMARY = "Development files for the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the development files."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "harfbuzz-devel-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "0ce55753e4645f852f80986fae69870ccdf3940ea5e6f2e27508022b57cbbd18aee42bcfa8217ac1fe768a3c4c1e8850cf2654531d1acdc96542a19e155cb085"

RPROVIDES:${PN} += "harfbuzz-devel \
pkgconfig-harfbuzz \
pkgconfig-harfbuzz-cairo \
pkgconfig-harfbuzz-gobject \
pkgconfig-harfbuzz-gpu \
pkgconfig-harfbuzz-icu \
pkgconfig-harfbuzz-raster \
pkgconfig-harfbuzz-subset \
pkgconfig-harfbuzz-vector"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libharfbuzz-cairo0 \
libharfbuzz-gobject0 \
libharfbuzz-gpu0 \
libharfbuzz-icu0 \
libharfbuzz-raster0 \
libharfbuzz-subset0 \
libharfbuzz-vector0 \
libharfbuzz0 \
pkgconfig-cairo \
pkgconfig-freetype2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-graphite2 \
pkgconfig-icu-uc \
pkgconfig-libpng \
pkgconfig-zlib \
typelib-1-0-HarfBuzz-0-0"

inherit rpm
