SUMMARY = "Shared library for NetworkManager-applet. Gtk4 version"
DESCRIPTION = "Shared library for NetworkManager-applet. Gtk4 version."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-gtk4-0-1.10.6-3.12.aarch64.rpm"
RPM_HASH = "ce6e869cec345c12753205dba8ddc3e83d265d65dc50b17d1d7b0235f38f3f1056fac71728faf7ea3d0831c83813162715070576e34a1b2eb20a5f605b89f395"

RPROVIDES:${PN} += "libnma-gtk4-0 \
libnma-gtk4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libnm.so.0 \
libnma-glib-schema \
mobile-broadband-provider-info"

inherit rpm
