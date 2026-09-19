SUMMARY = "Maven plugin for generating platform-dependent properties"
DESCRIPTION = "os-maven-plugin is a Maven extension/plugin that generates various \
useful platform-dependent project properties normalized from \
${os.name} and ${os.arch}. \
 \
${os.name} and ${os.arch} are often subtly different between JVM and \
operating system versions or they sometimes contain machine-unfriendly \
characters such as whitespaces. This plugin tries to remove such \
fragmentation so that you can determine the current operating system \
and architecture reliably."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "os-maven-plugin-1.7.1-1.7.noarch.rpm"
RPM_HASH = "1078cd6b042b3e18dce0fe1694e036589c90d5b853695f5d55b3ef3953f45e2d34e0314bf517b6d094a3b304674390aaa343bb9e7000c2313ae6d906f8a69330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-kr.motd.maven-os-maven-plugin \
mvn-kr.motd.maven-os-maven-plugin-pom- \
os-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
