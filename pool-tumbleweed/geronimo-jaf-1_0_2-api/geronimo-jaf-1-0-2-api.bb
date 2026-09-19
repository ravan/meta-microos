SUMMARY = "Geronimo Activation 1.0.2 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Activation Framework"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaf-1_0_2-api-1.2-41.6.noarch.rpm"
RPM_HASH = "9b6df69f7f49a9739616c27e8fd71366d36464780286bb721cc4e55c51ac1d4e406a75d752b19684688de7976f8201f2fb49ed24b46273cfa539923a289b76fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jaf-1-0-2-api \
mvn-org.apache.geronimo.specs-geronimo-activation-1.0.2-spec \
mvn-org.apache.geronimo.specs-geronimo-activation-1.0.2-spec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
