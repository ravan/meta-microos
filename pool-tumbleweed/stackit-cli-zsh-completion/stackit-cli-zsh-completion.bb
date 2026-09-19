SUMMARY = "Zsh Completion for stackit-cli"
DESCRIPTION = "zsh command line completion support for stackit-cli."
LICENSE = "Apache-2.0"

PV = "0.72.0"

RPM_NAME = "stackit-cli-zsh-completion-0.72.0-1.1.noarch.rpm"
RPM_HASH = "899cd731bb2c1bfff3a38b81f24cc71ce24f6f35b3b7fd569aec982f48cdffaf65b914462a387e7bdbee5b49326f1792e8409d6ef20f0bd45de4fb96516ac70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stackit-cli-zsh-completion"

RDEPENDS:${PN} += "stackit-cli \
zsh"

inherit rpm
