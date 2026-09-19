SUMMARY = "Zsh Completion for krelay"
DESCRIPTION = "zsh command line completion support for krelay."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "krelay-zsh-completion-0.2.0-1.4.noarch.rpm"
RPM_HASH = "b1cd276ad435c4f70dcc4f82c8bd7ef64045242866e0972264b7987a896bf1ff95a689748ee4cf41e40cbd4c385fad1273acdc4d6392500577e95b58637cda82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krelay-zsh-completion"

RDEPENDS:${PN} += "krelay \
zsh"

inherit rpm
