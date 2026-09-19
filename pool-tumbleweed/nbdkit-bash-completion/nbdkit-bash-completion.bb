SUMMARY = "Bash tab-completion for nbdkit"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-bash-completion-1.48.0-1.1.noarch.rpm"
RPM_HASH = "f984b3fccbfd555dd4b3dafe56c9fc2c7c2240c21989dabdf20abd49b89b700e9c4289b53e7c71651deda72499a65c94325a77b887b5eadbbd312dac05a14acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nbdkit-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nbdkit-server"

inherit rpm
