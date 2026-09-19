SUMMARY = "Bash Completion for kubectl-cnpg"
DESCRIPTION = "Bash command line completion support for kubectl-cnpg."
LICENSE = "Apache-2.0"

PV = "1.29.2"

RPM_NAME = "kubectl-cnpg-bash-completion-1.29.2-1.3.noarch.rpm"
RPM_HASH = "38e935eb0b8ee859e48cdc73a9d35cd12e57776d41b4f3bf229bb8835dc7789571e0b220d5b38e32eb04473d584e2d04f8061dfde37833ed3f244d4e85fec904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-cnpg-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubectl-cnpg"

inherit rpm
