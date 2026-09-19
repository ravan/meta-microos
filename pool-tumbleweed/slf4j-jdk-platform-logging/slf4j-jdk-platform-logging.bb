SUMMARY = "SLF4J Platform Logging Binding"
DESCRIPTION = "SLF4J Platform Logging Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-jdk-platform-logging-2.0.18-1.2.noarch.rpm"
RPM_HASH = "0661e5997f14671a2e03a45d5fc50979bb8b80114fa97ff4e2064d02327b3716eb6e32d848bd467479c6033263fcd377cefbcf37d43d5b53a33a828d72314a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-jdk-platform-logging \
mvn-org.slf4j-slf4j-jdk-platform-logging-pom- \
osgi-slf4j.jdk.platform.logging \
slf4j-jdk-platform-logging"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
