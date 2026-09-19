SUMMARY = "Bash Completion for kumactl"
DESCRIPTION = "Bash command line completion support for kumactl."
LICENSE = "Apache-2.0"

PV = "2.14.3"

RPM_NAME = "kumactl-bash-completion-2.14.3-1.1.noarch.rpm"
RPM_HASH = "4cadaa0edfc485ac0a3a543c6a45ce88d1e95c30fe9b4242426d2e89ad9504aeaf4e4b4724cc4efc930517bd2ce47450760d5cbd3ec8d62022e02f79c2f41c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kumactl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kumactl"

inherit rpm
