SUMMARY = "Bash Completion for opensc"
DESCRIPTION = "Bash completion script for opensc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.27.1"

RPM_NAME = "opensc-bash-completion-0.27.1-2.3.noarch.rpm"
RPM_HASH = "d1add3ffed5cd937b1a77584b71f5b6680b8d35f9bcba2b3c918bcc40969da4cbb2eeb0560e61d79d7626688398bada32808a9a6166e94fe4f80d6747d40d7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opensc-bash-completion"

RDEPENDS:${PN} += "bash-completion \
opensc"

inherit rpm
