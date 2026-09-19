SUMMARY = "Zsh Completion for zola"
DESCRIPTION = "Zsh command-line completion support for zola."
LICENSE = "MIT"

PV = "0.23.3"

RPM_NAME = "zola-zsh-completion-0.23.3-1.2.noarch.rpm"
RPM_HASH = "d1f0489fdaf80cb9ee3af6e897ca0cb2b7ca88a8c705060ed13437d86a7586c3fb153c4c17a90f71b9664eb09dc6979dcaa32b0c32e1efb9f5d53de7cb403c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
