SUMMARY = "JSch connector for jsch-agent-proxy"
DESCRIPTION = "JSch connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "jsch-agent-proxy-jsch-0.0.9-2.8.noarch.rpm"
RPM_HASH = "52ec651bd6b8b0f5374aec99a43649902791ec3b516ea2f33db82908b07e3f89c37c8d5a35aa7e90c367cb2c594ad63986bcd2e7a57e79cb8abd4f23215d25c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-jsch \
mvn-com.jcraft-jsch.agentproxy.jsch \
mvn-com.jcraft-jsch.agentproxy.jsch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch \
mvn-com.jcraft-jsch.agentproxy.core"

inherit rpm
