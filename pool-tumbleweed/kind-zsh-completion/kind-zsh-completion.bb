SUMMARY = "Zsh Completion for kind"
DESCRIPTION = "zsh command line completion support for kind."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "kind-zsh-completion-0.33.0-1.1.noarch.rpm"
RPM_HASH = "fdd0c04dd6c499ea6a15f563dd115c031d7870ef6141f64b037fe39955a3d8aeda048ca0444b2b273e422be8927fea0ded89a4f71c4389505a8f4be020d408b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kind-zsh-completion"

RDEPENDS:${PN} += "kind"

inherit rpm
