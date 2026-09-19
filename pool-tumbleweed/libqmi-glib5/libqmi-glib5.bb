SUMMARY = "Library to control QMI devices"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices \
which speak the Qualcomm MSM Interface (QMI) protocol."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "libqmi-glib5-1.38.0-1.3.aarch64.rpm"
RPM_HASH = "2b5d505af287ab7c7c698b226ca03a34124fb01137a465b318a30f80cdfc1b9e146efb06a20b268b9115be52de7e2de4a9440dadee82d25d6c4abc6879b35e92"

RPROVIDES:${PN} += "libqmi-glib.so.5 \
libqmi-glib5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmbim-glib.so.4 \
libqrtr-glib.so.0"

inherit rpm
