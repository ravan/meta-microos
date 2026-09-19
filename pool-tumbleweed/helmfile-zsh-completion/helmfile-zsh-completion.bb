SUMMARY = "Zsh Completion for helmfile"
DESCRIPTION = "Zsh command line completion support for helmfile."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "helmfile-zsh-completion-1.8.0-1.1.noarch.rpm"
RPM_HASH = "e57beb915207f0797666e84059d27b4b66e847197b8d429a2e410e09d5888dfc5eeecdec1341294417bd847dfa30dfd2afb9a182d2feaaadc0cddaad8bdb47c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helmfile-zsh-completion"

RDEPENDS:${PN} += "helmfile"

inherit rpm
