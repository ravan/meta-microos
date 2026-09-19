SUMMARY = "ZSH Completion for dwarfs"
DESCRIPTION = "ZSH command line completion support for dwarfs."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.15.7"

RPM_NAME = "dwarfs-zsh-completion-0.15.7-1.2.noarch.rpm"
RPM_HASH = "73531a04804137481c037f25433bc27c919ed899a2e7b4dfa30ced60e5fc259a3c3945dfcae5c34a4f28fe248f56ea5ffe4c8ba9d0d24cc386ddfbf82a850c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dwarfs-zsh-completion"

RDEPENDS:${PN} += "dwarfs \
zsh"

inherit rpm
