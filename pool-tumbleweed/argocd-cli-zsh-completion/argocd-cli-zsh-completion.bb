SUMMARY = "Zsh Completion for argocd-cli"
DESCRIPTION = "zsh command line completion support for argocd-cli."
LICENSE = "Apache-2.0"

PV = "3.5.2"

RPM_NAME = "argocd-cli-zsh-completion-3.5.2-1.1.noarch.rpm"
RPM_HASH = "de5027c70c363b38108ab017eb864e476f368ac329e5fba5561f26a02f9d5a1de79fa1e13131f61180aa9135883533f3858b93370bc754e188d36e4aefc56762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "argocd-cli-zsh-completion"

RDEPENDS:${PN} += "argocd-cli"

inherit rpm
