SUMMARY = "Fish Completion for ripgrep"
DESCRIPTION = "The official fish completion script for ripgrep, generated during the build."
LICENSE = "MIT & Unlicense"

PV = "15.2.0"

RPM_NAME = "ripgrep-fish-completion-15.2.0-1.3.noarch.rpm"
RPM_HASH = "6671dede241608016eee136bb0bb2690c1ddb84c38ace832dffa3864535744e5d93ece01451cffa63db1732efa35b0743dfe64314cea1785ae1c61ac2b4e2800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ripgrep-fish-completion"

RDEPENDS:${PN} += "ripgrep"

inherit rpm
