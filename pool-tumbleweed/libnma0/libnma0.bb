SUMMARY = "Shared library for NetworkManager-applet"
DESCRIPTION = "Shared library for NetworkManager-applet."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma0-1.10.6-3.12.aarch64.rpm"
RPM_HASH = "820959f26300e86b8b45448054ba6ff2022b5a98ee6909cec6690add101c5fe090cc167ab7b5f0a1b1a7d2edd20c6df19b13178476bfaa58f1e1831ceaf83122"

RPROVIDES:${PN} += "libnma \
libnma-data \
libnma.so.0 \
libnma0 \
nma-data"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnm.so.0 \
libnma-glib-schema \
mobile-broadband-provider-info"

inherit rpm
