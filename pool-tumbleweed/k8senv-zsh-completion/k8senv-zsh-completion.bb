SUMMARY = "Zsh Completion for k8senv"
DESCRIPTION = "zsh command line completion support for k8senv."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "k8senv-zsh-completion-1.1.1-1.13.noarch.rpm"
RPM_HASH = "fa90a967b91f1fde830d177414154d04c8d4ce76aefea686d8eb4577534c24e858a2c05478e70c2d84b5a55c45b3e8201480354e7be149b0696aeafa19ef0a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k8senv-zsh-completion"

RDEPENDS:${PN} += "k8senv"

inherit rpm
