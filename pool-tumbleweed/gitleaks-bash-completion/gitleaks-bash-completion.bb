SUMMARY = "Bash Completion for gitleaks"
DESCRIPTION = "Bash command line completion support for gitleaks."
LICENSE = "MIT"

PV = "8.30.1"

RPM_NAME = "gitleaks-bash-completion-8.30.1-1.4.noarch.rpm"
RPM_HASH = "1d9f1a712295411630c69b04415e0a294708bec8e3f4ecaa574d2742a693ab79c870be8185f691fc32dbe831b012c00f01581ce85585cc711ba9e6db873cd7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitleaks-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gitleaks"

inherit rpm
