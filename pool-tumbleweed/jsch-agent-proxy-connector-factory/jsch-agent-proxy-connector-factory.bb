SUMMARY = "Connector factory for jsch-agent-proxy"
DESCRIPTION = "Connector factory for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "jsch-agent-proxy-connector-factory-0.0.9-2.8.noarch.rpm"
RPM_HASH = "9a43f21e3e2a691c85f2a0dc0e05829137513eb52683dcb5fcb5c477a5eb16b09ae80160cc80512bcb6e3adb918a39ea8b072617dd4d8e2fe216d79a23a507c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-connector-factory \
mvn-com.jcraft-jsch.agentproxy.connector-factory \
mvn-com.jcraft-jsch.agentproxy.connector-factory-pom- \
osgi-com.jcraft.jsch.agentproxy.connector-factory"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-com.jcraft-jsch.agentproxy.pageant \
mvn-com.jcraft-jsch.agentproxy.sshagent \
mvn-com.jcraft-jsch.agentproxy.usocket-jna \
mvn-com.jcraft-jsch.agentproxy.usocket-nc"

inherit rpm
