SUMMARY = "Zsh Completion for kargo-cli"
DESCRIPTION = "zsh command line completion support for kargo-cli."
LICENSE = "Apache-2.0"

PV = "1.11.2"

RPM_NAME = "kargo-cli-zsh-completion-1.11.2-1.1.noarch.rpm"
RPM_HASH = "e7d8955deb4f842ef637ae94b520c6a730b0a95a8b5500b2e4f694427d796eeb212066b49c32d2ff3d470af18d6635c6c830317bdbc1b4b656403ea1a6e65e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kargo-cli-zsh-completion"

RDEPENDS:${PN} += "kargo-cli"

inherit rpm
