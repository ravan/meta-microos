SUMMARY = "Keyboard-oriented, Common Lisp extensible web-browser"
DESCRIPTION = "Nyxt is a keyboard-oriented, extensible web-browser designed for power users. \
It has familiar key-bindings (Emacs, VI, CUA), is fully configurable and \
extensible in Lisp, and has powerful features for productive professionals."
LICENSE = "BSD-3-Clause"

PV = "3.12.0"

RPM_NAME = "nyxt-3.12.0-2.6.aarch64.rpm"
RPM_HASH = "e44b4e0b2792af8225360e6175b65b55c354898bca3ff78c915d4c099319f12a0a91ce4bfad578aa5bed18156062916970f5375d11bfcf95ed53cdcde0bcef50"

RPROVIDES:${PN} += "nyxt"

RDEPENDS:${PN} += "/usr/bin/sh \
at-spi2-core \
enchant-tools \
glib-networking \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfixposix4 \
libgthread-2-0-0 \
libm.so.6 \
libwebkit2gtk-4-1-0 \
libzstd.so.1 \
xclip"

inherit rpm
