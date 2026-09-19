SUMMARY = "Helper utilities to control QMI devices"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices \
which speak the Qualcomm MSM Interface (QMI) protocol. \
 \
This package contains command line tools to manage such devices."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "libqmi-tools-1.38.0-1.3.aarch64.rpm"
RPM_HASH = "56efe480b1d18aff415b40bfe20c70a9f9c8e5bb13f1a264e7fca62f330a33f745f44cf0ca68a21690a1fb40546e9ec25c8ee938b097bb24ce76169555874dc7"

RPROVIDES:${PN} += "libqmi-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libmbim-glib.so.4 \
libqmi-glib.so.5 \
libqrtr-glib.so.0"

inherit rpm
