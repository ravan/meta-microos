SUMMARY = "A natural language date and time parser library for Vala/GLib applications"
DESCRIPTION = "A natural language date and time parser library for Vala/GLib applications. \
 \
Originally developed as part of Planify."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "chrono-devel-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "06b095ba5de9f042ba349344b7140621c43db3391d1a7d2729e47c38554b178a6069a5285e4e23793b89cfd54b3e95ebe0b344f74eac00d0694ed4f52bdb752d"

RPROVIDES:${PN} += "chrono-devel \
pkgconfig-chrono"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchrono0"

inherit rpm
