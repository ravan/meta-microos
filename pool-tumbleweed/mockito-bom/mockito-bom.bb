SUMMARY = "Mockito Bill of Materials (BOM)"
DESCRIPTION = "Mockito Bill of Materials (BOM)."
LICENSE = "MIT"

PV = "5.11.0"

RPM_NAME = "mockito-bom-5.11.0-3.2.noarch.rpm"
RPM_HASH = "9fe7aeb81784794a1c35c62633d3be93264dff47e9dc8e37aa384b6ad5cb1969ba4f00c410f641ae6a222201c2094b5abdaf61c6a00da308873d6215c69f0955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mockito-bom \
mvn-org.mockito-mockito-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mockito"

inherit rpm
