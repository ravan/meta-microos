SUMMARY = "Javadoc for maven-dependency-tree"
DESCRIPTION = "This package contains javadoc for maven-dependency-tree."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-dependency-tree-javadoc-3.3.0-1.2.noarch.rpm"
RPM_HASH = "88d5becdd3d326237b06317385cb7776577fca83f7b0c09779bb55c4664b9c456cd1a87f4b4e15b1fa1655e0c93b7a65bcf4e2a0a524404d56f2d13f1cf9ef28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-tree-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
