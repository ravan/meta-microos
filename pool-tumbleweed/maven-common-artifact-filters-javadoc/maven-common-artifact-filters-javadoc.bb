SUMMARY = "Javadoc for maven-common-artifact-filters"
DESCRIPTION = "This package contains javadoc for maven-common-artifact-filters."
LICENSE = "Apache-2.0"

PV = "3.3.2"

RPM_NAME = "maven-common-artifact-filters-javadoc-3.3.2-2.11.noarch.rpm"
RPM_HASH = "d0519b21a51f38ebdb8d469d0d8ed8e542f776d373e125fee501061081f60bc37899be15542a6c0b7ef1fa1a1f7760c97bddf16f5f705480dcb79aac718cf5e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-common-artifact-filters-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
