SUMMARY = "ZSH Completion for stgit"
DESCRIPTION = "ZSH command line completion support for stgit."
LICENSE = "GPL-2.0-only"

PV = "2.6.1"

RPM_NAME = "stgit-zsh-completion-2.6.1-3.3.noarch.rpm"
RPM_HASH = "3a743daef6935ff3a8c6459c65a31997a00f41ffaadcb012f4147441746638dab6b258466054464f16d65326ab7e33690295ce2b5fbccb2e9421f7297b458364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stgit-zsh-completion"

RDEPENDS:${PN} += "stgit \
zsh"

inherit rpm
