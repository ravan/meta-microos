SUMMARY = "Development files for bliss, a math library"
DESCRIPTION = "bliss is a tool for computing automorphism groups and canonical forms \
of graphs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the Bliss library."
LICENSE = "LGPL-3.0-only"

PV = "0.77"

RPM_NAME = "bliss-devel-0.77-1.19.aarch64.rpm"
RPM_HASH = "49b24855b0b3b815345098523e508765606ccbdf18245c25161b6d4ec282589a65789282e6c34a2e49a427da32ff970c605119c13bf6e688107fbc91a69a63a6"

RPROVIDES:${PN} += "bliss-devel"

RDEPENDS:${PN} += "libbliss0-77"

inherit rpm
