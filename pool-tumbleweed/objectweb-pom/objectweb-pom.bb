SUMMARY = "Objectweb POM"
DESCRIPTION = "This package provides Objectweb parent POM used by different \
Objectweb packages."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "objectweb-pom-1.5-1.18.noarch.rpm"
RPM_HASH = "54a25f4adfb846e93fd5460d1b811a3e6bff805386164b336c1726976ae28767d5d68c066ef7408b18e27df701ea973495e52ebef0c30092897618106c19d8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.ow2-ow2-pom- \
objectweb-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-enforcer-plugin"

inherit rpm
