SUMMARY = "Exec into node via kubectl"
DESCRIPTION = "Start a root shell in the node's host OS running. \
(formerly known as kubectl-enter)"
LICENSE = "Apache-2.0"

PV = "1.11.0"

RPM_NAME = "kubectl-node-shell-1.11.0-1.6.noarch.rpm"
RPM_HASH = "ac4ca64f23546b5c2e282db95fb0ba0a9681e15a640beab03f73ea0adfb2f3d54358ad0e275a69690196fbff62c2df8e6c5145ce87b231ffd0defe858a3f01eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-node-shell"

RDEPENDS:${PN} += "/usr/bin/sh \
bash"

inherit rpm
