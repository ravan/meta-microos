SUMMARY = "Bash Completion for prek"
DESCRIPTION = "Bash command line completion support for prek."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "prek-bash-completion-0.5.0-1.1.noarch.rpm"
RPM_HASH = "4a49085f018949f38e5e9c22272911b6cb16453ad80e8bda10a4653603a0be0df88c4abaf3a244c5c3aec8c43542eba3257f9a4b012db23c66a448851877bc59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prek-bash-completion"

RDEPENDS:${PN} += "bash-completion \
prek"

inherit rpm
