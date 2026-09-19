SUMMARY = "ZSH Completion for typioca"
DESCRIPTION = "The official zsh completion script for typioca, generated during the build."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "typioca-zsh-completion-3.1.0-1.13.noarch.rpm"
RPM_HASH = "795999728339105a2d5864a4a509c7bf2f3897bc985968a30a30d593f23a8ba761126c747186ae3526b4e042a02d09bb648a8c973bc387e04f14ceb0d54f99af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typioca-zsh-completion"

RDEPENDS:${PN} += "typioca"

inherit rpm
