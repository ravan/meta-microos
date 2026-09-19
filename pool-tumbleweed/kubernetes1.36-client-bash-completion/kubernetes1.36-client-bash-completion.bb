SUMMARY = "Bash Completion for kubernetes1.36-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.36-client"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-client-bash-completion-1.36.4-2.1.noarch.rpm"
RPM_HASH = "22301114013f6fe21a88a435902e059f7ba13dd555b8b1e0aa7b1bf4c5c712a124fa4e0e343510907bc6e2a9504fa00249ac1b0d0a8654918cffc9ca91c86316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.36-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.36-client"

inherit rpm
