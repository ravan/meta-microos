SUMMARY = "Bash completion for pyenv"
DESCRIPTION = "Bash command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "pyenv-bash-completion-2.8.4-1.1.noarch.rpm"
RPM_HASH = "a0fa882db3ebb657c643e006ae17a7924cad4eaf2b191b30abd785db263d4bb86b83ecd305cf93d366427811a7d85454a10af7a68222e163683df8f3a0d061a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-bash-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
