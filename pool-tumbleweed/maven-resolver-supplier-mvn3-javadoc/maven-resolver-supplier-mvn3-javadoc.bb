SUMMARY = "API documentation for maven-resolver-supplier-mvn3"
DESCRIPTION = "This package provides API documentation for maven-resolver-supplier-mvn3."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-supplier-mvn3-javadoc-2.0.22-1.1.noarch.rpm"
RPM_HASH = "5ea167566f91aa957231a2f7b643c6df1d8eea62b52e443c247d6cc084895c46b946fb0ee8d401c95ae21aa1ca44a94decff16d9290f445eaa283f1a2f1d4f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-supplier-mvn3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
