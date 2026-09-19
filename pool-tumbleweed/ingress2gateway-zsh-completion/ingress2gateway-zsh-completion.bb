SUMMARY = "Zsh Completion for ingress2gateway"
DESCRIPTION = "zsh command line completion support for ingress2gateway."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "ingress2gateway-zsh-completion-1.2.0-1.2.noarch.rpm"
RPM_HASH = "4369940ba407c7774b74dc25b440f5b7f49871bb7610c9d548f36d7c5e8f873197b55df464519c3a1e654ca06c810c1f2b6d2bc67dc036822d62a13e58439510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ingress2gateway-zsh-completion"

RDEPENDS:${PN} += "ingress2gateway \
zsh"

inherit rpm
