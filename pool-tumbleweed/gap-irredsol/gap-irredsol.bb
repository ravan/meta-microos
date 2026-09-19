SUMMARY = "GAP: Library of irreducible soluble linear groups over finite fields"
DESCRIPTION = "IRREDSOL provides a library of irreducible soluble linear groups over \
finite fields and of finite primivite soluble groups."
LICENSE = "BSD-2-Clause"

PV = "1.4.4"

RPM_NAME = "gap-irredsol-1.4.4-1.9.noarch.rpm"
RPM_HASH = "d87276616b8826f4eec80d609fc4bcbbb41d5231a2c79819ea2d1981d167727b836888060c9644c69ac32cc7517806ef7d78e679890810787e4f5cb3497e0e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-irredsol"

RDEPENDS:${PN} += "gap-core"

inherit rpm
