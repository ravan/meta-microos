SUMMARY = "Javadoc for plexus-testing"
DESCRIPTION = "Javadoc for plexus-testing."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "plexus-testing-javadoc-2.1.0-2.3.noarch.rpm"
RPM_HASH = "3ca72751c9b4950b37722b5d79ed120614fc73bb27dca90e44007a3bbc5796eaa2e9f30820901e8205e05d0be0f6cbd2249961ed7ba82b9a67a6402703776fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-testing-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
