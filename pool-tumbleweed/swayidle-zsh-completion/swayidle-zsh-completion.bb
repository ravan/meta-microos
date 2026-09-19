SUMMARY = "Zsh completion for swayidle"
DESCRIPTION = "Zsh command line completion support for swayidle."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "swayidle-zsh-completion-1.9.0-1.5.noarch.rpm"
RPM_HASH = "affe960d77a998a31f510df2df0e3a5fb8442674ff45cbcfca623c3910643cd5aa86169921e17c9b55ba4659d29633aef82c5cacde303821b1c4e9f3b163a6d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swayidle-zsh-completion"

RDEPENDS:${PN} += "swayidle"

inherit rpm
