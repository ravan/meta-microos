SUMMARY = "X TrueType font cache extension client library"
DESCRIPTION = "FontCache is an extension that is used by X TrueType to cache \
information about fonts."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "libXfontcache1-1.0.5-13.11.aarch64.rpm"
RPM_HASH = "22ee05708ee4a566388676285383d09ae5b5c2d44ad06cc1f6e16b25cf73aa6c284c5df682c4269f1f8d3cbe782cd45677f98ffe3c163b4c574d214c1e51c058"

RPROVIDES:${PN} += "libXfontcache.so.1 \
libXfontcache1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
