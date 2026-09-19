SUMMARY = "Qualcomm IPC Router protocol helper library"
DESCRIPTION = "libqrtr-glib is a glib-based library to use and manage the QRTR (Qualcomm \
IPC Router) bus."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libqrtr-glib0-1.2.2-1.17.aarch64.rpm"
RPM_HASH = "4391287b1171ebb61691b24bf4ae9c11db6a785b5187267ba5ed4b0a832e72370528ee25be8be047914f65247d271a5bbeea3d71c7ae2f64dba1ae8f9eff91d5"

RPROVIDES:${PN} += "libqrtr-glib.so.0 \
libqrtr-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
