SUMMARY = "Development files for glyr, a music metadata search engine"
DESCRIPTION = "Glyr development files."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "glyr-devel-1.0.10-5.4.aarch64.rpm"
RPM_HASH = "9295ed3fd78ca3ae577cf9d8292f5cb24f16686f686656fda19c63daf6526c24753f8eadd280653946a2d6e74b609f9ac3196c6cbfc50d96a7f5cd20b536adc0"

RPROVIDES:${PN} += "glyr-devel \
libglyr-devel \
pkgconfig-libglyr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglyr1 \
pkgconfig-sqlite3"

inherit rpm
