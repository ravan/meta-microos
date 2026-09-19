SUMMARY = "Bash Completion for tlpctl"
DESCRIPTION = "The official bash completion script for tlpctl."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlpctl-bash-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "a918bcb72b0d69458796d97e45fff0c9c2b8b7df60996ab4b92d038cea888a1e2c6e8a071079f472551099d973f3cad6cdeee87bf50bc5e7ca9a81545fdcc2b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlpctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tlp-pd"

inherit rpm
