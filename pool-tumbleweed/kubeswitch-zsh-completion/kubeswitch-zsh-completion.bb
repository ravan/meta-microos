SUMMARY = "Zsh Completion for kubeswitch"
DESCRIPTION = "zsh command line completion support for kubeswitch."
LICENSE = "Apache-2.0"

PV = "0.9.3"

RPM_NAME = "kubeswitch-zsh-completion-0.9.3-1.10.noarch.rpm"
RPM_HASH = "2d1c3fd5a7c2353d223b38a089a068f50fc7946d86abc2e72f4b9ea46dad794e61561228144c9b8872ae0149875d413b36925cdc887a2b4d459afbc8b63c428e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeswitch-zsh-completion"

RDEPENDS:${PN} += "kubeswitch"

inherit rpm
