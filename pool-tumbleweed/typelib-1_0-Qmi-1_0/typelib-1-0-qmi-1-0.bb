SUMMARY = "Introspection bindings for libqmi"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices \
which speak the Qualcomm MSM Interface (QMI) protocol. \
 \
This package contains the introspection bindings for libqmi."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "typelib-1_0-Qmi-1_0-1.38.0-1.3.aarch64.rpm"
RPM_HASH = "34e9ee8cad4a1b2ef8dba13f8e1dc26448420de6fcefe89ba3c48ffe43ed1b5a828de598b6948572f9df6cd8ee97a9f74a9a5c40f8a8226e3adac18a6ff7bf21"

RPROVIDES:${PN} += "typelib-1-0-Qmi-1-0 \
typelib-Qmi"

RDEPENDS:${PN} += "libqmi-glib.so.5 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Qrtr"

inherit rpm
