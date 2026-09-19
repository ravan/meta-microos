SUMMARY = "Xfconf Shared Library"
DESCRIPTION = "This package contains the xfconf shared library."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "libxfconf-0-3-4.20.0-1.9.aarch64.rpm"
RPM_HASH = "38e22f045af85dd33d12bdf66dc091e777cf0bd9fe89486448d203e1b1f68d30b3bf978bfce5efc93b7c04df9e688ec30e800b5e2ac85480cad25e5a56d4b2ae"

RPROVIDES:${PN} += "libxfce4mcs \
libxfconf-0-3 \
libxfconf-0.so.3 \
libxfconfgsettingsbackend.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
xfconf"

inherit rpm
