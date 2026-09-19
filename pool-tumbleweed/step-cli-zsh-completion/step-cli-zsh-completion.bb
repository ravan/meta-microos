SUMMARY = "ZSH completion for step-cli"
DESCRIPTION = "zsh shell completions for step-cli."
LICENSE = "Apache-2.0"

PV = "0.30.6"

RPM_NAME = "step-cli-zsh-completion-0.30.6-1.3.noarch.rpm"
RPM_HASH = "573fbbf4106137f5ce496b61f5f46e9402b3b244bd57bdce74c5f9c049ac8cd4b1503778ccddc41219a5c8a60cb01a63e30981e52f10b95d511532bb8cea78d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-step-cli-zsh-completion \
step-cli-zsh-completion"

RDEPENDS:${PN} += "step-cli \
zsh"

inherit rpm
