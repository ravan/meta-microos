SUMMARY = "Zsh Completion for netbird-signal"
DESCRIPTION = "Zsh command line completion support for netbird-signal."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-signal-zsh-completion-0.78.1-1.1.noarch.rpm"
RPM_HASH = "34a80bedb36af76190999a1a988e944779b0858b5dca627f62ecd856b0a1847f466bb1f1cd7eefa48659cc734807519b1dca8d162119c1790a95b24278d6c6cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbird-signal-zsh-completion"

RDEPENDS:${PN} += "netbird-signal \
zsh"

inherit rpm
