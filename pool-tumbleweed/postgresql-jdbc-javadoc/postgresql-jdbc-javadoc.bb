SUMMARY = "API docs for postgresql-jdbc"
DESCRIPTION = "This package contains the API Documentation for postgresql-jdbc."
LICENSE = "BSD-2-Clause"

PV = "42.7.11"

RPM_NAME = "postgresql-jdbc-javadoc-42.7.11-1.2.noarch.rpm"
RPM_HASH = "0cd8ffe7270282356298690474076d9e936c76f8e62c2e8b993ea5b1e6fd606fd0dd6601719611bcfeadedaf6b6945881da6a40fa8c81685a5e33d852ef70afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
