SUMMARY = "Bash Completion for dwarfs"
DESCRIPTION = "Bash command line completion support for dwarfs."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.15.7"

RPM_NAME = "dwarfs-bash-completion-0.15.7-1.2.noarch.rpm"
RPM_HASH = "32882f83cdba1d1e9bacb6214e7f46cdf1d4bb448d2e0d6547a8bbeb671f73209c7fa4dde87b050b297c2e513066fbe1fe5173d47396b975050b465675eb1acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dwarfs-bash-completion"

RDEPENDS:${PN} += "bash-completion \
dwarfs"

inherit rpm
