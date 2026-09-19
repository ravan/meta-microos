SUMMARY = "Development files for hyprcursor"
DESCRIPTION = "Library for handling the hyprland cursor format. \
 \
This subpackage contains development files for hyprcursor."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "hyprcursor-devel-0.1.13-1.6.aarch64.rpm"
RPM_HASH = "2d68fe1de6f2a722518e12a3552a9fc2a1a340a3ca181a018d724708dc1b120af4ed4ffdba8bd5213c57da01efb409278c6d757235579f8f69943094981b72a3"

RPROVIDES:${PN} += "hyprcursor-devel \
pkgconfig-hyprcursor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhyprcursor0"

inherit rpm
