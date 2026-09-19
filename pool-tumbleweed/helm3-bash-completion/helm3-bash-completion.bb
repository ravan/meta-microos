SUMMARY = "Bash Completion for helm3"
DESCRIPTION = "Bash command line completion support for helm3."
LICENSE = "Apache-2.0"

PV = "3.21.3"

RPM_NAME = "helm3-bash-completion-3.21.3-6.1.noarch.rpm"
RPM_HASH = "cf801fd8a7087e23ec9b16acfa1ce83a56b588b099d5c2165507d8e909eb49674e6659cd1548dc404188cfd827b4053fbbc029e8dee5eaa937fe5a4de3b33776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm3-bash-completion"

RDEPENDS:${PN} += "bash-completion \
helm3"

inherit rpm
