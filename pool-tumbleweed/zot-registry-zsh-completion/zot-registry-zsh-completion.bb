SUMMARY = "Zsh Completion for zot-registry"
DESCRIPTION = "zsh command line completion support for zot-registry."
LICENSE = "Apache-2.0"

PV = "2.1.20"

RPM_NAME = "zot-registry-zsh-completion-2.1.20-1.1.noarch.rpm"
RPM_HASH = "430a462e0ba2ace63d4f5371d881bd6b7516c8f8ba838bbcabed13afb772a98e5f0147244b32acb95de717b1c362467281d4ed1e3688876d518f97f06ccfd898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zot-registry-zsh-completion"

RDEPENDS:${PN} += "zot-registry \
zsh"

inherit rpm
