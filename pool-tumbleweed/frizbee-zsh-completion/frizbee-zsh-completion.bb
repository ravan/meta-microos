SUMMARY = "Zsh Completion for frizbee"
DESCRIPTION = "zsh command line completion support for frizbee."
LICENSE = "Apache-2.0"

PV = "0.1.11"

RPM_NAME = "frizbee-zsh-completion-0.1.11-1.1.noarch.rpm"
RPM_HASH = "b11986bc22b6ca027ab8d455377501356bbfb183ac5b2a1ba9033cba2911ed081f7a8f741d953682f34234a7419c0bbb6bde5ac985dfebe4e165c15e12a84880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frizbee-zsh-completion"

RDEPENDS:${PN} += "frizbee"

inherit rpm
