SUMMARY = "Javadoc for tiger-types"
DESCRIPTION = "This package contains javadoc for tiger-types."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.2"

RPM_NAME = "tiger-types-javadoc-2.2-5.10.noarch.rpm"
RPM_HASH = "f94f9c1b86c88dcb73452e6b848e51fc857971fbd0471511973ab5db4cc6106a1da7cc36ed0c811475ef5fdee2de523340c83f9916cde2444cfcf6b100049178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiger-types-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
