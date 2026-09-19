SUMMARY = "Fish Completion for conftest"
DESCRIPTION = "Fish command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.69.0"

RPM_NAME = "conftest-fish-completion-0.69.0-1.1.noarch.rpm"
RPM_HASH = "3893aa82de51b546f2ad54cbe9b2d7772d2670fbbec355664a0f9262f6116100d9b6296dcb7fd797cbf54eb503fdeaa0f1711b43bad21fc06972e70a27cc4edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-fish-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
