SUMMARY = "Javadoc for xmlunit"
DESCRIPTION = "Javadoc for xmlunit. Also contains userguide."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "xmlunit-javadoc-2.11.0-2.4.noarch.rpm"
RPM_HASH = "1df72c165585dd49a13fe35c94c2c0dd2c008b99b170546c4b668f00534f737c02ef4a6a6e29c91b5578258c673c944f5a000c6535d8a277326e75abe6ed517b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlunit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
