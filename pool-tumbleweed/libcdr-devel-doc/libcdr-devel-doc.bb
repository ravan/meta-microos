SUMMARY = "Documentation for the libcdr API"
DESCRIPTION = "This package contains documentation for the libcdr API."
LICENSE = "MPL-2.0"

PV = "0.1.9"

RPM_NAME = "libcdr-devel-doc-0.1.9-1.3.noarch.rpm"
RPM_HASH = "2581622294fabcea9370c386e9973a3f7cd12d720a314e50e9bc4d4fd373c093b1e7d3874e62699fb175192e76cbdd011c522b6074dcf47bdbf966e618996593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcdr-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
