SUMMARY = "Javadocs for mockito"
DESCRIPTION = "This package contains the API documentation for mockito."
LICENSE = "MIT"

PV = "5.11.0"

RPM_NAME = "mockito-javadoc-5.11.0-3.2.noarch.rpm"
RPM_HASH = "fc135c77668fcb2f86737566d9fae7a80a3e9d9ef0b3a166258e8bb88af99389d53046acdc0be621f50750a142fe739a5a9476c07d256e945ca2fa9b19d865bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mockito-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
