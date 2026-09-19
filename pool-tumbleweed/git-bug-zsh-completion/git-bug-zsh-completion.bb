SUMMARY = "ZSH completion for git-bug"
DESCRIPTION = "zsh shell completions for git-bug"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "git-bug-zsh-completion-0.10.1-7.1.noarch.rpm"
RPM_HASH = "6daf996cdabe347e14f8bd214a50afe030cef96b27ccd01a06df0fb504d884450d88d63d6cdeef6c6419162c5b45f99b032c0b2f96ea9d06cf9a59549d3f29a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-git-bug-zsh-completion \
git-bug-zsh-completion"

RDEPENDS:${PN} += "git-bug \
zsh"

inherit rpm
