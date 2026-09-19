SUMMARY = "EPPIC include files and libraries"
DESCRIPTION = "EPPIC is a C interpreter that permits easy access to the symbol and type \
information stored in a executable image like a coredump or live memory \
interfaces (e.g. /dev/kmem, /dev/mem). Although it has a strong association \
with live or postmortem kernel analysis, it is not constraint to it and can be \
embedded in any tools that is C friendly. \
 \
This package provides the include files and libraries needed for development."
LICENSE = "GPL-2.0-or-later"

PV = "4.99.git.1773318907.51b15e7"

RPM_NAME = "libeppic-devel-4.99.git.1773318907.51b15e7-1.4.aarch64.rpm"
RPM_HASH = "76134b30f45ffe47b1347978fb86465990d251f0fb65a061888d756bd4ac47c760c960001a3f00f8902ad7d42600325386c1d71c9d1327ea5b8dab1d50905329"

RPROVIDES:${PN} += "libeppic-devel"

RDEPENDS:${PN} += ""

inherit rpm
