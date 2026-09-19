SUMMARY = "Multi-word bitmask abstract data type (used by cpusets)"
DESCRIPTION = "The Cpuset System is a processor and memory placement mechanism that \
The libbitmask package provides an abstract data type for arbitrary \
length bit masks, with a variety of operators.	The cpuset package \
depends on libbitmask."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "libbitmask-devel-2.0-29.17.aarch64.rpm"
RPM_HASH = "0dc9a3cac529247cfe50568f489af651a10437fbef379390cffa5575b01b50037e25ba7a960c659b1c16d5fb05f7fe4741370a0b1d3e848dd4649d74adfaa3f7"

RPROVIDES:${PN} += "libbitmask-devel"

RDEPENDS:${PN} += "libbitmask1"

inherit rpm
