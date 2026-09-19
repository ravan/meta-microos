SUMMARY = "Bash Completion for kubeone"
DESCRIPTION = "Bash command line completion support for kubeone."
LICENSE = "Apache-2.0"

PV = "1.14.3"

RPM_NAME = "kubeone-bash-completion-1.14.3-1.1.noarch.rpm"
RPM_HASH = "6a9d5e973a8d4670fdbf00f7b1d65123c3b2a53ca133c0137ec51fff951005d4d1ccedc7e1d635bbc874474bcce08154e7f3ed0e2a5c21e35179968b8060807c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeone-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubeone"

inherit rpm
