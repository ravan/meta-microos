SUMMARY = "API documentation for jboss-marshalling"
DESCRIPTION = "This package contains API documentation for jboss-marshalling."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-javadoc-1.4.11-3.17.noarch.rpm"
RPM_HASH = "8635accd60dcb07f9977a0b5c0bd73233477ef4b042bea7f5fe1b159fc2656972aa95910a2125e683f119364ae036036d88e6a7fb7c6f6dd8d5942885a218df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
