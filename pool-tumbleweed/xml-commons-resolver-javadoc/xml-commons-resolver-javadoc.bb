SUMMARY = "Javadoc for xml-commons-resolver"
DESCRIPTION = "Javadoc for xml-commons-resolver."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "xml-commons-resolver-javadoc-1.2-5.11.noarch.rpm"
RPM_HASH = "b239b52ab0d775b014097f540f9b18fab0e3c66e1e4c2d893ca86081c3f7c46a7e2a2ca07affe8bd43fdbc39e669fb0ec66123ff12ff09a0436fc66e1a4ed4ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-commons-resolver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
