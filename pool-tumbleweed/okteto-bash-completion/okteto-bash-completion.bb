SUMMARY = "Bash Completion for okteto"
DESCRIPTION = "Bash command line completion support for okteto."
LICENSE = "Apache-2.0"

PV = "3.22.0"

RPM_NAME = "okteto-bash-completion-3.22.0-1.1.noarch.rpm"
RPM_HASH = "1b0e9eaccea0d37979a5c2567e4475596489285c127e2f4ed09c5b9ca584f0c88f6b3e1994215028bfc25356c868638b6258619831bd26f25bb186418634ecb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "okteto-bash-completion"

RDEPENDS:${PN} += "bash-completion \
okteto"

inherit rpm
