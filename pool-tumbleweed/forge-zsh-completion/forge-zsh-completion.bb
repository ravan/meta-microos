SUMMARY = "Zsh Completion for forge"
DESCRIPTION = "Zsh command line completion support for forge."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "forge-zsh-completion-0.10.0-1.1.noarch.rpm"
RPM_HASH = "109742aebecf06687a361a5cec3a7a2164af2ca228143122a08c4fc31a47edaed53eb995119175c06ecdd4247bfbd381215bcacaa9543d5f79d659f40fef3d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forge-zsh-completion"

RDEPENDS:${PN} += "forge \
zsh"

inherit rpm
