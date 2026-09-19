SUMMARY = "Zsh Completion for mesheryctl"
DESCRIPTION = "zsh command line completion support for mesheryctl."
LICENSE = "Apache-2.0"

PV = "1.0.65"

RPM_NAME = "mesheryctl-zsh-completion-1.0.65-1.1.noarch.rpm"
RPM_HASH = "b1d4a79526c5471538626726565f5549d2df43c8b89fc9b0639121cd5aacb65dbc72a8e266286c01b87f4b0428b4c00d77219c896e3b33d4a67045a3fbdf514c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mesheryctl-zsh-completion"

RDEPENDS:${PN} += "mesheryctl"

inherit rpm
