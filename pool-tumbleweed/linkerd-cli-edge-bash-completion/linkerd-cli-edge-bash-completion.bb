SUMMARY = "Bash Completion for linkerd-cli-edge"
DESCRIPTION = "Bash command line completion support for linkerd-cli-edge."
LICENSE = "Apache-2.0"

PV = "26.8.4"

RPM_NAME = "linkerd-cli-edge-bash-completion-26.8.4-1.1.noarch.rpm"
RPM_HASH = "3f634e279f63236b4bbcd0527fe8034a0c6404506482464b79af294f0dabce55d0851c7362cb022c5794144a11db498e993886203faf26edc28bab978126887e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linkerd-cli-edge-bash-completion"

RDEPENDS:${PN} += "bash-completion \
linkerd-cli-edge"

inherit rpm
