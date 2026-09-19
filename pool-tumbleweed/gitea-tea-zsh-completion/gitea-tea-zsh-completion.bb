SUMMARY = "Zsh Completion for Gitea's tea CLI"
DESCRIPTION = "Zsh command line completion support for Gitea's tea CLI."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "gitea-tea-zsh-completion-0.16.0-1.1.noarch.rpm"
RPM_HASH = "01597144f06ea4710e6cc870cb76f69635b3ac97165b2a959c0eb5473bdf4dbef4d7de022367bd63b20520f209f99910e9f7ad1a33b3f5e49398ac6159ac68f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitea-tea-zsh-completion"

RDEPENDS:${PN} += "gitea-tea \
zsh"

inherit rpm
