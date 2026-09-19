SUMMARY = "Javadoc for maven-filtering"
DESCRIPTION = "This package contains the API documentation for maven-filtering."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-filtering-javadoc-3.5.1-1.1.noarch.rpm"
RPM_HASH = "27c95641cd4e5756d8b09bd86eba0454b0154fdb4ed7283de3931c3863ca943561d86ae517104425c9afc4b164c3e77f5fd68cb139fb8b8fbbc67922eea7987e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-filtering-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
