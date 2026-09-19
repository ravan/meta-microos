SUMMARY = "Network-related GIO modules for glib"
DESCRIPTION = "This package contains network-related GIO modules for glib. \
 \
Currently, there is only a proxy module based on libproxy."
LICENSE = "LGPL-2.1-or-later"

PV = "2.80.1"

RPM_NAME = "glib-networking-2.80.1-4.1.aarch64.rpm"
RPM_HASH = "7876c80eafd69bf3262512a808fac9ea56026b30a4c5d2d09db7a3897512de3b5728621092510dc8eec75e33eb32c5d5221af8a9d85f8d275ba1341ad7a9097f"

RPROVIDES:${PN} += "glib-networking \
libgiognomeproxy.so \
libgiognutls.so \
libgiolibproxy.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates-mozilla \
glib2-tools \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libproxy.so.1"

inherit rpm
