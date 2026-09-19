SUMMARY = "Zsh Completion for kubepug"
DESCRIPTION = "zsh command line completion support for kubepug."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "kubepug-zsh-completion-1.7.1-2.12.noarch.rpm"
RPM_HASH = "e72ffe56f68c465b9100d65d5dae48594e944ec54ad44b7e47d028665b3139f6009547d5d743f910af555521569e6c201e7a46d94d57c79b40b8f06e33ed8560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubepug-zsh-completion"

RDEPENDS:${PN} += "kubepug"

inherit rpm
