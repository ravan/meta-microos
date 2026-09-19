SUMMARY = "Fish Completion for kubesec"
DESCRIPTION = "Fish command line completion support for kubesec."
LICENSE = "Apache-2.0"

PV = "2.14.2"

RPM_NAME = "kubesec-fish-completion-2.14.2-1.11.noarch.rpm"
RPM_HASH = "a357958e8c90c1ea7e962dd834485af6f6cd213d1094fc318ee64f764005dd30915d8895ed371170f98de1f69b7db670d4ce3e5532a828311899e21b198f206c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubesec-fish-completion"

RDEPENDS:${PN} += "kubesec"

inherit rpm
