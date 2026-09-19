SUMMARY = "HK2 Metadata Generator"
DESCRIPTION = "HK2 Metadata Generator Subsystem."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-metadata-generator-2.5.0-11.6.noarch.rpm"
RPM_HASH = "e21b531ca883e17e42f4e03083b8b884ed9e60d0118d64aa11c25f7dcfe2bcd426d316ae4e87c5be23e072bedc74c0579f6b5307f492aaea8d4e9ef8c2d71e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-metadata-generator \
mvn-org.glassfish.hk2-hk2-metadata-generator \
mvn-org.glassfish.hk2-hk2-metadata-generator-parent-pom- \
mvn-org.glassfish.hk2-hk2-metadata-generator-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
