SUMMARY = "Documentation for coq"
DESCRIPTION = "HTML reference manual for Coq."
LICENSE = "OPUBL-1.0"

PV = "9.2.0"

RPM_NAME = "rocq-doc-9.2.0-2.1.noarch.rpm"
RPM_HASH = "e063818426898462f72a7b22cdbc5fa4314ee2526a24df03717b83619e6cbcff7deadba6eed2d5f271bbabaea90d51d05c481ed1c0023fc230aa1d754121d2ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coq-doc \
rocq-doc"

RDEPENDS:${PN} += "rocq"

inherit rpm
