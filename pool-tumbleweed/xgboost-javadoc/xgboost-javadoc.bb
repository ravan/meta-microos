SUMMARY = "Javadoc for xgboost"
DESCRIPTION = "Javadoc for xgboost"
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "xgboost-javadoc-2.0.0-4.5.noarch.rpm"
RPM_HASH = "3a2d06411865b48b8eb5074fa208ea03e53835d62ce3125756a5202ef9dbc6b414a2b74c94521cf61d9bec6684a58667e2d59af4912cc71c3be3fcd7965e4d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xgboost-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
