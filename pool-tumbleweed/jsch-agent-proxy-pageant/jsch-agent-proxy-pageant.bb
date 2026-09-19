SUMMARY = "Pageant connector for jsch-agent-proxy"
DESCRIPTION = "Pageant connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "jsch-agent-proxy-pageant-0.0.9-2.8.noarch.rpm"
RPM_HASH = "ea7d085ea3ab6a02b1fde40170c3d21fed4a904bb65175706e2bb9d036133b6976c53e3c87f98da1aab2d43f7c697d2874122c2bfaccabe90b73809e2e3bce2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-pageant \
mvn-com.jcraft-jsch.agentproxy.pageant \
mvn-com.jcraft-jsch.agentproxy.pageant-pom- \
osgi-com.jcraft.jsch.agentproxy.pageant"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-net.java.dev.jna-jna \
mvn-net.java.dev.jna-jna-platform"

inherit rpm
