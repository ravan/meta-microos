SUMMARY = "ZSH Completion for skim"
DESCRIPTION = "The official zsh completion script for skim, generated during the build."
LICENSE = "MIT"

PV = "5.7.0"

RPM_NAME = "skim-zsh-completion-5.7.0-1.1.noarch.rpm"
RPM_HASH = "de72b1a84c3a4e4787605f6276cd95edca93ae1bd6072e20034677e330bfe4d9907d1264cfc4d39db95e69c25a740cae74605989ea4e91474da0775c9ae2acda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skim-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
