SUMMARY = "Javadoc for javadoc-parser"
DESCRIPTION = "This package contains API documentation for javadoc-parser."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "javadoc-parser-javadoc-0.3.1-1.9.noarch.rpm"
RPM_HASH = "9086a5bea2e4382974da1fe3dc3abfae1cc013a7e1d268d0a555e718271fc6c1cc1292b1e1d84dbcb6670c1b8949d95772e0ef66df634e539bc056439dfa6759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javadoc-parser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
