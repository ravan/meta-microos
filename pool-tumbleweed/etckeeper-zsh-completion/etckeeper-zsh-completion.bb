SUMMARY = "The zsh completion for etckeeper"
DESCRIPTION = "zsh command line completion support for etckeeper."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.22"

RPM_NAME = "etckeeper-zsh-completion-1.18.22-1.4.noarch.rpm"
RPM_HASH = "13d33cca4f44a93acc41a44f575e22b3eb5ab0efeffd34b5546f1dcb1aa5fc331a884243c829d6d98538b01ac9c9da71b48bef32a466f3ce1cc7806abaf2fcb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etckeeper-zsh-completion"

RDEPENDS:${PN} += "etckeeper"

inherit rpm
