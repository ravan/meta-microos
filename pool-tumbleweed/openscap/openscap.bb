SUMMARY = "A Set of Libraries for Integration with SCAP"
DESCRIPTION = "OpenSCAP is a set of open source libraries providing an easier path for \
integration of the SCAP line of standards. \
 \
SCAP is a line of standards managed by NIST with the goal of providing \
a standard language for the expression of Computer Network Defense \
related information. \
 \
More information about SCAP can be found at nvd.nist.gov."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "openscap-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "6d554870ca940884d0f79214797db0e3d0ea004dbede5bcc771446d1bf12454cff5a4190746dd266bdca0c794eeab2ff96863119209badec224f61e475ce5ddc"

RPROVIDES:${PN} += "openscap"

RDEPENDS:${PN} += ""

inherit rpm
