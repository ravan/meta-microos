SUMMARY = "API documentation for java-diff-utils"
DESCRIPTION = "API documentation for java-diff-utils."
LICENSE = "Apache-2.0"

PV = "4.12"

RPM_NAME = "java-diff-utils-javadoc-4.12-1.10.noarch.rpm"
RPM_HASH = "f4257d7bdc424f5ff4bfebd072c64cad0b6e2f7040f821c83829f9fcb6223eb52229d59014744880d672a8f9f95e1d8da119dc3b64ef1dc8d43653d31bb92e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-diff-utils-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
