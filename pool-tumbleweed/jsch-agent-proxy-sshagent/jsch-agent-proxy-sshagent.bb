SUMMARY = "ssh-agent connector for jsch-agent-proxy"
DESCRIPTION = "ssh-agent connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "jsch-agent-proxy-sshagent-0.0.9-2.8.noarch.rpm"
RPM_HASH = "160705bc624af914caa089d2c3777d6848dc9eecda4b0255a2786589893be7c2147a67cf09b432cfe622a0054de59aeb04e12d5a5f92f0ed5058af9b45a9f633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-sshagent \
mvn-com.jcraft-jsch.agentproxy.sshagent \
mvn-com.jcraft-jsch.agentproxy.sshagent-pom- \
osgi-com.jcraft.jsch.agentproxy.sshagent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core"

inherit rpm
