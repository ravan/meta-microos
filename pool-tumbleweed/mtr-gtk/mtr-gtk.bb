SUMMARY = "Ping and Traceroute Network Diagnostic Tool"
DESCRIPTION = "Mtr is a network diagnostic tool which combines Ping and Traceroute \
into one program. This package contains mtr with a GTK interface. \
You'll find the text mode version in the mtr package."
LICENSE = "GPL-2.0-only"

PV = "0.96"

RPM_NAME = "mtr-gtk-0.96-1.6.aarch64.rpm"
RPM_HASH = "a79bae957de2b02e89c0e09b8ef7b0f68db411d9741ecc91fb5b7a5e53a84ef90d13286a92cd8d4f859e0c1884d9ffddd8b34b66ef07921dfb46ff9973ef0c2b"

RPROVIDES:${PN} += "mtr-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjansson.so.4 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
mtr \
xdg-utils"

inherit rpm
