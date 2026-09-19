SUMMARY = "Bash Completion for kubernetes1.34-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.34-client"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-client-bash-completion-1.34.11-2.1.noarch.rpm"
RPM_HASH = "3e0def7485fdaabdb544faa81bc5207ab4671cb212182889d47894afd4e6901206625e28687169561cf0d6d226c65be30858228d72e3f84923b56f9c235a1780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.34-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.34-client"

inherit rpm
