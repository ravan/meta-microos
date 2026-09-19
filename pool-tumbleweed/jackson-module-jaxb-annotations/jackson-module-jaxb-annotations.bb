SUMMARY = "Support for using JAXB annotations as an alternative to 'native' Jackson annotations"
DESCRIPTION = "This Jackson extension module provides support for using JAXB (javax.xml.bind) \
annotations as an alternative to native Jackson annotations. It is most often \
used to make it easier to reuse existing data beans that used with JAXB \
framework to read and write XML."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-jaxb-annotations-2.18.9-1.1.noarch.rpm"
RPM_HASH = "13db36dd45cb8c2db6e47e91476b2712b30487b23b0af8e7ef1769d5d8a8b5ee336bed516b037fdf929a72efcea5517eaa85683d4cffd8388402199716584031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-jaxb-annotations \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-jaxb-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-javax.activation-javax.activation-api \
mvn-javax.xml.bind-jaxb-api"

inherit rpm
