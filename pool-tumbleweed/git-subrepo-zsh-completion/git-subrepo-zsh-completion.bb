SUMMARY = "ZSH completion for git-subrepo"
DESCRIPTION = "zsh shell completions for git-subrepo"
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "git-subrepo-zsh-completion-0.4.9-1.1.noarch.rpm"
RPM_HASH = "95c75e4f3d2033ca7fed6e746e36aaa3605032a11b8bc18b376a6d0292518c1e6b97b376c1cb512e5c006e425623320558301d0f86e9d6c35216c72bef7d62c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-subrepo-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
