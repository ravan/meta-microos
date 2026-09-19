SUMMARY = "Bash Completion for kyverno"
DESCRIPTION = "Bash command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "kyverno-bash-completion-1.19.0-1.1.noarch.rpm"
RPM_HASH = "582318d007cd08736bd8503e1e313ec98427517fc210b0f7ffc7c6e44c1f41aafed179e83ce63ee50a10559d644881de73c5a5cc458b074d4b067c0af569325f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kyverno"

inherit rpm
