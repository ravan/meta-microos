SUMMARY = "Zsh Completion for tekton-cli"
DESCRIPTION = "zsh command line completion support for tekton-cli."
LICENSE = "Apache-2.0"

PV = "0.46.0"

RPM_NAME = "tekton-cli-zsh-completion-0.46.0-1.1.noarch.rpm"
RPM_HASH = "e3d8f792f0e63106ac447f9c2cfe98c5e7c3bc96b5e189f84f26afb28728fe9ed20ef80bfe4a839aed54a7b58f58d95ca9c2e1f4c79b831c01fde6b3166891ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tekton-cli-zsh-completion"

RDEPENDS:${PN} += "tekton-cli"

inherit rpm
