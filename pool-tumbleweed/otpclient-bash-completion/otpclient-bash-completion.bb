SUMMARY = "Bash completion for otpclient"
DESCRIPTION = "Bash command line completion support for otpclient."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.8"

RPM_NAME = "otpclient-bash-completion-5.1.8-1.1.noarch.rpm"
RPM_HASH = "53827a73331e6453ed63fad1be2aeb1d517fe2f4943b2ef21185fac460b269a4f563207156eb48c136e3ebef815d038e944640f210801e2d0d351ecf9bd75f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "otpclient-bash-completion"

RDEPENDS:${PN} += "bash-completion \
otpclient"

inherit rpm
