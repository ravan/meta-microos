SUMMARY = "Zsh Completion for apko"
DESCRIPTION = "zsh command line completion support for apko."
LICENSE = "Apache-2.0"

PV = "1.2.41"

RPM_NAME = "apko-zsh-completion-1.2.41-1.1.noarch.rpm"
RPM_HASH = "529341b6fceed457389b97ce498c7176ac774947752f47c07d0f01f3bdb270b2a72281ebf923629eb00eb0a0eed0aad885869b4013db062d4cb9265357dd7417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apko-zsh-completion"

RDEPENDS:${PN} += "apko"

inherit rpm
