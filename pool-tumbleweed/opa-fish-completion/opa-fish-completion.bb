SUMMARY = "Fish Completion for opa"
DESCRIPTION = "Fish command line completion support for opa."
LICENSE = "Apache-2.0"

PV = "1.20.1"

RPM_NAME = "opa-fish-completion-1.20.1-1.1.noarch.rpm"
RPM_HASH = "5d60892b62248996ce789f7e410e6f5f3e66552ab9bc810f92eb4ea08de1f2ed2903e98e8cc7eed52d7bd85256f33a4c91d036705b40c014b016de1f7d51e520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opa-fish-completion"

RDEPENDS:${PN} += "fish \
opa"

inherit rpm
