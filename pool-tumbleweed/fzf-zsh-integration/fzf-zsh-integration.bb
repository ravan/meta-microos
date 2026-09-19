SUMMARY = "ZSH completion for fzf"
DESCRIPTION = "zsh shell completions for fzf"
LICENSE = "MIT"

PV = "0.74.3"

RPM_NAME = "fzf-zsh-integration-0.74.3-1.1.noarch.rpm"
RPM_HASH = "9811abaddf2dc2bb0a0d7825b5ddd7e1cd446aa44c834beac227b17d6779f4ac71245752a7510637be080a0b78e8d6f288853a4529837c769ddbf50e41ec7213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fzf-zsh-integration \
fzf-zsh-completion \
fzf-zsh-integration"

RDEPENDS:${PN} += "fzf \
zsh"

inherit rpm
