SUMMARY = "Javadoc for jdeparser"
DESCRIPTION = "This package contains the API documentation for jdeparser."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "jdeparser-javadoc-2.0.3-2.14.noarch.rpm"
RPM_HASH = "357e35d3dc6686d8d84946b5261563eaaf37595656182ec2b8a06101ee521ca539bde7797497b38af180c55f1f06ff305a52d1b0e82e7a0fe04636c455316866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdeparser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
