SUMMARY = "ZSH Completion for nnn"
DESCRIPTION = "The official zsh completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "5.2"

RPM_NAME = "nnn-zsh-completion-5.2-1.3.noarch.rpm"
RPM_HASH = "8d0badff9fa839468ecd1f81f095516512bbd82efdc64d2fc3a62b2bf61bf23a5023e12b236f1515c53419d0dfd2295fb4b7f3158ba2e08273f54babeab58377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
