SUMMARY = "The spiritual successor to FeedReader"
DESCRIPTION = "NewsFlash is a program designed to complement an already existing web-based RSS reader account. \
It combines all the advantages of web based services like syncing across all your devices with everything you expect \
from a modern desktop program: Desktop notifications, fast search and filtering, tagging, handy keyboard shortcuts \
and having access to all your articles as long as you like."
LICENSE = "GPL-3.0-only"

PV = "5.2.5"

RPM_NAME = "newsflash-5.2.5-1.2.aarch64.rpm"
RPM_HASH = "b984ce209e35559689b2718a2aaf4400d6a04ca79aa91d307e30ddd2b1b393740a1370631c6e552b9d6cf8e27248f56e4d254f9db9af8d057c26ae3bfe1799cc"

RPROVIDES:${PN} += "newsflash"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libclapper-0.0.so.0 \
libclapper-gtk-0.0.so.0 \
libcrypto.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libseccomp.so.2 \
libsqlite3.so.0 \
libssl.so.3 \
libxml2.so.16"

inherit rpm
