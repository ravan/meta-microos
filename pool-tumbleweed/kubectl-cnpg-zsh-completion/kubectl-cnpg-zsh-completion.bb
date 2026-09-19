SUMMARY = "Zsh Completion for kubectl-cnpg"
DESCRIPTION = "zsh command line completion support for kubectl-cnpg."
LICENSE = "Apache-2.0"

PV = "1.29.2"

RPM_NAME = "kubectl-cnpg-zsh-completion-1.29.2-1.3.noarch.rpm"
RPM_HASH = "c444a56daa12e008571aaa858e4325f248a61922b136b8eb10a3ee9b3a55a0cacdf7c5c0196f9cf7f16fca61fb2e3fc8e4b436fe8ba2ca65a0184e6dffb2e18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-cnpg-zsh-completion"

RDEPENDS:${PN} += "kubectl-cnpg"

inherit rpm
