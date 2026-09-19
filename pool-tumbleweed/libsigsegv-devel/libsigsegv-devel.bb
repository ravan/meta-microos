SUMMARY = "Library for Handling Page Faults in User Mode"
DESCRIPTION = "This is a library for handling page faults in user mode. A page fault occurs \
when a program tries to access to a region of memory that is currently not \
available."
LICENSE = "GPL-2.0-or-later"

PV = "2.15"

RPM_NAME = "libsigsegv-devel-2.15-1.1.aarch64.rpm"
RPM_HASH = "649eda87416478b71bdc5385d1eacdc8ee6dad336902936e2f640fa328f53c134c1cedb70ba19a54d10c700f94eadfdc9a2cee4b8cb23d64beb94823f38e8ad5"

RPROVIDES:${PN} += "libsigsegv-devel"

RDEPENDS:${PN} += "libsigsegv2"

inherit rpm
