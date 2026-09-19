SUMMARY = "Zsh Completion for tlrc"
DESCRIPTION = "Zsh command-line completion support for tlrc."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "tlrc-zsh-completion-1.13.1-1.4.noarch.rpm"
RPM_HASH = "3689e2fdb2a5b4015102c40e962798f9b2ced1b4c08a709d3ecc4a9f047b9c520806c8695f6c6da83c89a2cc4b573f03cede57cc84a379e723c15ac4530e22f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlrc-zsh-completion"

RDEPENDS:${PN} += "tlrc \
zsh"

inherit rpm
