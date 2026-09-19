SUMMARY = "API documentation for maven-archetype"
DESCRIPTION = "API documentation for maven-archetype."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-archetype-javadoc-3.4.1-1.7.noarch.rpm"
RPM_HASH = "ae218a3acf26c84df93da1a5d5d67012d02e43c419dd98128048b0cf5df6ab4354d75a43b6b313a965b014e1ab283fd576dae84cdc55cee4ce3a0232f90af325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
