SUMMARY = "Javadocs for antlr-maven-plugin"
DESCRIPTION = "This package contains the API documentation for antlr-maven-plugin."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "antlr-maven-plugin-javadoc-2.2-10.6.noarch.rpm"
RPM_HASH = "1622f8e41dc509ea0e10a5de0fa9ed703cd376264d355759b59e7d70ce61654837699a03a9521e66dbce770f7673f4aefe1167454fd4b2335d95cda6151be077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
