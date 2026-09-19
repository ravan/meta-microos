SUMMARY = "JSON in Java"
DESCRIPTION = "Capa abstracta de acceso a tarjetas inteligentes 100% java"
LICENSE = "JSON"

PV = "20240303"

RPM_NAME = "json-java-20240303-1.5.noarch.rpm"
RPM_HASH = "fe167b44a4b079ca550a3506ab4fa47b09e02d300d5e54f0d84003cdd1f8c63caa459b11f8202f48f0a364c9ad412b7859fa10acc539470d605d8dde70ebf265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-java \
mvn-org.json-json \
mvn-org.json-json-pom- \
osgi-json"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
