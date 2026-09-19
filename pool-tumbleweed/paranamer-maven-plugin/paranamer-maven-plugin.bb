SUMMARY = "ParaNamer Maven plugin"
DESCRIPTION = "This package contains the ParaNamer Maven plugin."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-maven-plugin-2.8-4.10.noarch.rpm"
RPM_HASH = "5010a9b59e1200ae3ff244993e0382d7179ee68ab5a0d7030a9d3f444bb01eaaf82ff0b10a796a7e4d1ee9732b64b3f59f6c466d27bff6e3f04afd7e8f67415b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-maven-plugin \
mvn-com.thoughtworks.paranamer-paranamer-maven-plugin-pom- \
paranamer-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-org.apache.maven-maven-plugin-api"

inherit rpm
