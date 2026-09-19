SUMMARY = "Fish Completion for nelm"
DESCRIPTION = "Fish command line completion support for nelm."
LICENSE = "Apache-2.0"

PV = "1.25.3"

RPM_NAME = "nelm-fish-completion-1.25.3-1.2.noarch.rpm"
RPM_HASH = "16345262f27b5fe54112465057beb97d81fc38a7923a10910479cf43bd2534060b617bd54d8e53ec24f90785879422c58fadae2e661c19134add80e40cfb917f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nelm-fish-completion"

RDEPENDS:${PN} += "fish \
nelm"

inherit rpm
