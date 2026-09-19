SUMMARY = "API documentation for xml-stylebook"
DESCRIPTION = "API documentation for xml-stylebook."
LICENSE = "Apache-1.1"

PV = "1.0~b3_xalan2"

RPM_NAME = "xml-stylebook-javadoc-1.0~b3_xalan2-1.8.noarch.rpm"
RPM_HASH = "55a32ad93117a18fdafbbf4e73b5ad1db304d4fb8eda6b5d6135c5d689178c7db13537e6005f12712153c5555247e88c41c30e5b62baad1bf91e8c690bfb902d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-stylebook-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
