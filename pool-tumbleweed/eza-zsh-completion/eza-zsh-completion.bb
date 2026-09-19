SUMMARY = "Zsh Completion for eza"
DESCRIPTION = "Zsh command line completion support for eza."
LICENSE = "EUPL-1.2"

PV = "0.23.5"

RPM_NAME = "eza-zsh-completion-0.23.5-1.3.noarch.rpm"
RPM_HASH = "d5595cc5d4aa8b65a46319503ada5c935e4b3e79c45a785725bac4f606cee4768f0dc25d2caf1512d353fd022f46a684f92c5474965beb7008ea42ddaf04aba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eza-zsh-completion"

RDEPENDS:${PN} += "eza"

inherit rpm
