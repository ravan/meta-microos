SUMMARY = "Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.4"

RPM_NAME = "libayatana-indicator7-0.9.4-2.4.aarch64.rpm"
RPM_HASH = "8b3caa3d5315eb44f401a43ab086829568a74719b2ac765c1234aad160312c1652322a99a5a9b2735d5a087a1031c1d2778bd89413434f68f86c4b4caf867cca"

RPROVIDES:${PN} += "libayatana-indicator.so.7 \
libayatana-indicator7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ayatana-indicator7-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
