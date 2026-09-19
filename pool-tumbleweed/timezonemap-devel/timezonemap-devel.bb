SUMMARY = "Development headers for timezonemap"
DESCRIPTION = "Development headers for timezonemap."
LICENSE = "GPL-3.0-only"

PV = "0.4.6"

RPM_NAME = "timezonemap-devel-0.4.6-1.11.aarch64.rpm"
RPM_HASH = "1dee5b9ce32619187975ee29274d9b78dfa4cd234388cd17b1ed60da0dff39a8009d3b9ba32f932c8fd43995effbd34085bffa1ca7738e115bceb69abf41915d"

RPROVIDES:${PN} += "pkgconfig-timezonemap \
timezonemap-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtimezonemap1 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0"

inherit rpm
