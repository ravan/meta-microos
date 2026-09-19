SUMMARY = "Javadoc for maven-plugin-testing"
DESCRIPTION = "API documentation for maven-plugin-testing."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-plugin-testing-javadoc-3.5.1-1.4.noarch.rpm"
RPM_HASH = "558739e31ca7cd019f09128de076d571f17567a4d1523e345904b4294e1a189f69421708723bdf76fb0f2e817ae707972f7154e366025a25c577ee36513be9d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
