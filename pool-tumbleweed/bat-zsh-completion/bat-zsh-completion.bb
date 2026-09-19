SUMMARY = "Zsh completion for bat"
DESCRIPTION = "Zsh command line completion support for bat."
LICENSE = "Apache-2.0 | MIT"

PV = "0.26.1"

RPM_NAME = "bat-zsh-completion-0.26.1-2.2.noarch.rpm"
RPM_HASH = "aa109d98d9a5824afadd6be0412cd411bd807b25dbdb69868c0701c2d066616f75370e996a573d782d34c742b87bd0ef31bbed22ef31e02eb14d45c3a0780c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-zsh-completion"

RDEPENDS:${PN} += "bat"

inherit rpm
