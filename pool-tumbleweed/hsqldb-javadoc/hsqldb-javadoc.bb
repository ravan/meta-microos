SUMMARY = "Javadoc for hsqldb"
DESCRIPTION = "Javadoc for hsqldb."
LICENSE = "BSD-3-Clause"

PV = "2.7.4"

RPM_NAME = "hsqldb-javadoc-2.7.4-1.7.noarch.rpm"
RPM_HASH = "95e3cace8257a9a46a10f6c8cc05da342780aea86570d064c3ddabc19a0b518b26f8d92fafb4d1b637fe379ed50c9d4ad236f5fd996abbc890637e37492690f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hsqldb-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
