SUMMARY = "Zsh Completion for conftest"
DESCRIPTION = "Zsh command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.69.0"

RPM_NAME = "conftest-zsh-completion-0.69.0-1.1.noarch.rpm"
RPM_HASH = "3fee0da41bd2dfd1e435dc33e0bde2afb341b3227b691e911a6f36bb818abcf0dd1e730a4157050546fd9c17aee85448d8ba32a64b490239313634847ffc8cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-zsh-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
