SUMMARY = "Zsh Completion for skaffold"
DESCRIPTION = "zsh command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.24.0"

RPM_NAME = "skaffold-zsh-completion-2.24.0-1.2.noarch.rpm"
RPM_HASH = "2add91e22262cb7e85bf1fe9fbf9b8874e175173de74123f2bcbe749f1eeb742b58c20c52f8f4a07d04474a816019145a7565052b5f462a26ca20fab70cc081e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-zsh-completion"

RDEPENDS:${PN} += "skaffold \
zsh"

inherit rpm
