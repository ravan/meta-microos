SUMMARY = "API documentation of the RTRlib"
DESCRIPTION = "This is the API documentation of the RTRlib, a C implementation of \
the RPKI/Router Protocol client."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "rtrlib-devel-doc-0.8.0-3.5.noarch.rpm"
RPM_HASH = "62ea2589f8a2e5738f375309cd4b1b792b5576a148039c5a933e6546847ab64a20d61b081b697b4173f21fbcea49f46ac8acd671b1ee5fa67fe167e1314251b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rtrlib-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
