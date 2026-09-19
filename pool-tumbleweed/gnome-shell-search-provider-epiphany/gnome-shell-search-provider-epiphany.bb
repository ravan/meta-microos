SUMMARY = "Epiphany Search Provider for GNOME Shell"
DESCRIPTION = "Epiphany is a Web browser for the GNOME Desktop. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Web (epiphany)"
LICENSE = "GPL-3.0-or-later"

PV = "50.6"

RPM_NAME = "gnome-shell-search-provider-epiphany-50.6-2.1.aarch64.rpm"
RPM_HASH = "0884b26b2b7b14ed4d81416d5ff6930ebabc08ea15b44b385c0136457be00b279659712756e7e9635411f790508b1d1455718839764ce3b108dcd1664a477528"

RPROVIDES:${PN} += "gnome-shell-search-provider-epiphany"

RDEPENDS:${PN} += "epiphany \
gnome-shell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libephymain.so \
libephymisc.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
