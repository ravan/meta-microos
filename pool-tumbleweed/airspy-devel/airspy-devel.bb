SUMMARY = "Development files for airspy"
DESCRIPTION = "Library headers for airspy driver."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "airspy-devel-1.0.10-3.5.aarch64.rpm"
RPM_HASH = "3fdb48dac40eebc36aa36e262f97e35e489649d2ff80b55aa23bb475323a80b8c131af8c1644b7d3b7cfecc525aecccea31fa02d593304b25e2db0a830452829"

RPROVIDES:${PN} += "airspy-devel \
pkgconfig-libairspy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libairspy0"

inherit rpm
