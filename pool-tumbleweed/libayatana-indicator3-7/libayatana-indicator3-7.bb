SUMMARY = "Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.4"

RPM_NAME = "libayatana-indicator3-7-0.9.4-2.4.aarch64.rpm"
RPM_HASH = "75621770d918a6175751610706be1248b95ef2ac56f74e46a97f443c2f4749bc27e4e55fdb8184ba1eddcc5c8551a49f7444947d697eabec8ecbd36518cdc136"

RPROVIDES:${PN} += "libayatana-indicator3-7 \
libayatana-indicator3.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ayatana-indicator3-7-common \
ld-linux-aarch64.so.1 \
libayatana-ido3-0.4.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
