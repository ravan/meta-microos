SUMMARY = "Fish Completion for ctlptl"
DESCRIPTION = "Fish command line completion support for ctlptl."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "ctlptl-fish-completion-0.9.5-1.1.noarch.rpm"
RPM_HASH = "ac254e5a06f54fddd70362abc0cc02eacb1c4938a9e17f0d74c94aac60f0e1eb78e72c65e195169cd02a10478abf66b4d39d470662084d0ba93c3b10c862a3e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ctlptl-fish-completion"

RDEPENDS:${PN} += "ctlptl \
fish"

inherit rpm
