SUMMARY = "Documentation for the Automaton Library"
DESCRIPTION = "Documentation for the Automaton library."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python-automaton-doc-3.5.0-1.1.noarch.rpm"
RPM_HASH = "2f7b0ae0176fb7714b87ba835da52d2ba58c6bcae7b0269b4970f4bb00a9b6daff7576e94d93872d7ecdbd61cc5d16aea878a7e45499af9159c8328f26550f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-automaton-doc"

RDEPENDS:${PN} += ""

inherit rpm
