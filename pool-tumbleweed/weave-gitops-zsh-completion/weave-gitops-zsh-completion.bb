SUMMARY = "Zsh Completion for weave-gitops"
DESCRIPTION = "zsh command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.38.0"

RPM_NAME = "weave-gitops-zsh-completion-0.38.0-1.16.noarch.rpm"
RPM_HASH = "1009f8eafc3dfc7608ad24891e52af0e5d938968bb5fa233335e98ec0a2602d39911c24ca73fd15d0a2e5b648cae807dc8b0aab77f55aced55a0e58c55ae609d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-zsh-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm
