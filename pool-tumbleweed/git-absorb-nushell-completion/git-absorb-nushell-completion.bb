SUMMARY = "Nushell Completion for git-absorb"
DESCRIPTION = "The official nushell completion script for git-absorb, generated during the build."
LICENSE = "BSD-3-Clause"

PV = "0.6.17"

RPM_NAME = "git-absorb-nushell-completion-0.6.17-1.9.noarch.rpm"
RPM_HASH = "6dd555025e8e82f3182fb1a3eb17e6045153b6b44146a72e1da5139b92a8210668dfdac58262b226751d1138cdcaccb147f6c74dba92a375ea34f58160c1880e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-absorb-nushell-completion"

RDEPENDS:${PN} += "git-absorb"

inherit rpm
