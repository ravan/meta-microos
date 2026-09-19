SUMMARY = "Configuration library for JVM languages"
DESCRIPTION = "Configuration library for JVM languages."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "typesafe-config-1.4.1-6.8.noarch.rpm"
RPM_HASH = "e4a055ed6fa1f221e08edfa9d587708818486183f202cc3bdf35307b02f5ee48a9d5ce215a483cbe72a74a0563fb15091c1674c50d77b55f7a40511c3f852e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.typesafe-config \
mvn-com.typesafe-config-pom- \
typesafe-config"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
