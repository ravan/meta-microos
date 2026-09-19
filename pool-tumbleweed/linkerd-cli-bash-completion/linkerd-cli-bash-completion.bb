SUMMARY = "Bash Completion for linkerd-cli"
DESCRIPTION = "Bash command line completion support for linkerd-cli."
LICENSE = "Apache-2.0"

PV = "2.20"

RPM_NAME = "linkerd-cli-bash-completion-2.20-1.3.noarch.rpm"
RPM_HASH = "cdfe25fa8d33a93d66560a97459416b57faf7063102da3939ea390be7faad63716076b5e9f003caf473cd9f55dc84a40338863e10a2bcc0e64bbce2fa72f0761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linkerd-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
linkerd-cli"

inherit rpm
