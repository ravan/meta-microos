SUMMARY = "Development files for the X TrueType font cache library"
DESCRIPTION = "FontCache is an extension that is used by X TrueType to cache \
information about fonts. \
 \
This package contains the development headers for the library found \
in libXfontcache1."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "libXfontcache-devel-1.0.5-13.11.aarch64.rpm"
RPM_HASH = "23b1948c30ceb1dedf1f2f50fb835f26a9eea641f8012fdb5e81f79fedb843db5bae32ec55339a428b5093ac0ba808ebe5b44790ca1a2ab69d5bfa8579d76b1b"

RPROVIDES:${PN} += "libXfontcache-devel \
pkgconfig-xfontcache"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXfontcache1 \
pkgconfig-fontcacheproto \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
