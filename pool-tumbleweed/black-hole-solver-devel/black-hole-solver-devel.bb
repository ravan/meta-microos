SUMMARY = "Black Hole Solver development headers"
DESCRIPTION = "Files needed for building applications against Black Hole Solver."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "black-hole-solver-devel-1.14.0-1.5.aarch64.rpm"
RPM_HASH = "8c93e525dbedc0ee9e19a0212be7edf6bfcc21525148b1526c5d2b330494adf461227a7d3681fe0b7389239af9ffc23684cf4b5c896150e4028cada1cff411eb"

RPROVIDES:${PN} += "black-hole-solver-devel \
pkgconfig-libblack-hole-solver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblack-hole-solver1"

inherit rpm
