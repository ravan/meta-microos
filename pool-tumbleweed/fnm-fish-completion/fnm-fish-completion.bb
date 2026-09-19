SUMMARY = "Fish Completion for fnm"
DESCRIPTION = "Fish command-line completion support for fnm."
LICENSE = "GPL-3.0-only"

PV = "1.38.1"

RPM_NAME = "fnm-fish-completion-1.38.1-1.10.noarch.rpm"
RPM_HASH = "c9c84c2e3c204e399eb7f1f4879145c5eb3da8fc441362a64d51d06ce536970b8ec3c47475cc039f77ee8cbaa9eb49afbc134e40839c4257732c4b1e9247693c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fnm-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
