SUMMARY = "GAP: A HAP extension for crytallographic groups"
DESCRIPTION = "This package is an add-on for Graham Ellis's HAP package. HAPcryst \
implements some functions for crystallographic groups (namely \
OrbitStabilizer-type methods). It is also capable of calculating free \
resolutions for Bieberbach groups. \
 \
This is an extension to the HAP package by Graham Ellis. It implements \
geometric methods for the calculation of resolutions of Bieberbach groups."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1"

RPM_NAME = "gap-hapcryst-0.2.1-1.1.noarch.rpm"
RPM_HASH = "f063ebc5a7e81f2c5caa4fd318dbec82aa825409dbd01c2e15e301d34415a035b02ef47e2894a11c3fa9b7e242b1ffd1f3bd7064b805b17d81583c200b05c36e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-hapcryst"

RDEPENDS:${PN} += "/usr/bin/bash \
gap-aclib \
gap-core \
gap-cryst \
gap-hap \
gap-polycyclic \
gap-polymaking \
polymake"

inherit rpm
