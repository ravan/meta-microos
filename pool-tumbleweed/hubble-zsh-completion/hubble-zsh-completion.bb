SUMMARY = "Zsh Completion for hubble"
DESCRIPTION = "zsh command line completion support for hubble."
LICENSE = "Apache-2.0"

PV = "1.19.4"

RPM_NAME = "hubble-zsh-completion-1.19.4-1.4.noarch.rpm"
RPM_HASH = "f1cdeca04046c9f90e2789c470eaa0ab18e54886c6ae0f38357062c6a429417887ad7d4678460643f3812f35e646558cc65f99a7e3853903885fa7379b95b8f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hubble-zsh-completion"

RDEPENDS:${PN} += "hubble"

inherit rpm
