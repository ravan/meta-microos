SUMMARY = "Zsh Completion for kubeone"
DESCRIPTION = "zsh command line completion support for kubeone."
LICENSE = "Apache-2.0"

PV = "1.14.3"

RPM_NAME = "kubeone-zsh-completion-1.14.3-1.1.noarch.rpm"
RPM_HASH = "8ea7f8b45e4e30915c3437a69c1293dd50eea36d270e308db782d068e2fb405be423b2f12ef5640386a1fc4a987188978c198d8bce7c964e4c9ec117e021133c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeone-zsh-completion"

RDEPENDS:${PN} += "kubeone"

inherit rpm
