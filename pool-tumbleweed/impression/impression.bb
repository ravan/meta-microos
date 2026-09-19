SUMMARY = "A straight-forward and modern application to create bootable drives"
DESCRIPTION = "Write disk images onto your drives with ease. Select an image, insert your \
drive, and you're good to go! Impression is a useful tool for both avid \
distro-hoppers and casual computer users. See Press for content mentioning \
Impression from various writers, content creators, etc."
LICENSE = "GPL-3.0-only"

PV = "3.7.0"

RPM_NAME = "impression-3.7.0-1.3.aarch64.rpm"
RPM_HASH = "34f9d3d94aa179cdb7fe24779b938ee5cee1ee84a51e8c718064e2ad427c502d90ead329baba818d31bf8add7cd98d8bcafacea7e50541b1df3d085cca730958"

RPROVIDES:${PN} += "impression"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libssl.so.3"

inherit rpm
