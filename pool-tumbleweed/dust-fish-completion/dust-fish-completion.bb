SUMMARY = "Fish completion for dust"
DESCRIPTION = "Fish command line completion support for dust."
LICENSE = "Apache-2.0"

PV = "1.2.5"

RPM_NAME = "dust-fish-completion-1.2.5-1.2.noarch.rpm"
RPM_HASH = "7be924cb76299ff70536a8182715d10685aede96732cdcda445cd33cbac2545d50084cdbd69ac61c76bd04db782c05e8ad43e9d2e5fc55281c592854e89ec03b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dust-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
