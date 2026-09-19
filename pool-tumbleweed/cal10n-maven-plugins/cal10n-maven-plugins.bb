SUMMARY = "Compiler assisted localization library (CAL10N) maven plugins"
DESCRIPTION = " \
Compiler Assisted Localization, abbreviated as CAL10N (pronounced as 'calion') \
is a java library for writing localized (internationalized) messages. \
 \
This package contains maven plugins"
LICENSE = "MIT"

PV = "0.8.1.12"

RPM_NAME = "cal10n-maven-plugins-0.8.1.12-2.7.noarch.rpm"
RPM_HASH = "786da1beca07875c6c48296da8bd6823afbd4a64034389787ba9b43d0d61c64dc137c6672eb42ca2fbb63ff7873e26545e9df9270ca59a18b06622ea16f9da9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cal10n-maven-plugins \
mvn-ch.qos.cal10n-maven-cal10n-plugin-smoke \
mvn-ch.qos.cal10n-maven-cal10n-plugin-smoke-pom- \
mvn-ch.qos.cal10n.plugins-maven-cal10n-plugin \
mvn-ch.qos.cal10n.plugins-maven-cal10n-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ch.qos.cal10n-cal10n-api \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api"

inherit rpm
