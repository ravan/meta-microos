SUMMARY = "Zsh Completion for marvin"
DESCRIPTION = "zsh command line completion support for marvin."
LICENSE = "Apache-2.0"

PV = "0.2.13"

RPM_NAME = "marvin-zsh-completion-0.2.13-1.1.noarch.rpm"
RPM_HASH = "2002a59a629dab3d7df472aceea29b612a9f1256da730d6e47ae9345a3162431ee4ceb3d3c0adc5ad18422ef0db34ca7d38b7c5c8b6b28139e33d4ebf0e00e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marvin-zsh-completion"

RDEPENDS:${PN} += "marvin"

inherit rpm
