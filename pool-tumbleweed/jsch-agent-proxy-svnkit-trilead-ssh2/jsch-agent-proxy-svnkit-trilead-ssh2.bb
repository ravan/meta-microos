SUMMARY = "trilead-ssh2 connector for jsch-agent-proxy"
DESCRIPTION = "trilead-ssh2 connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "jsch-agent-proxy-svnkit-trilead-ssh2-0.0.9-2.8.noarch.rpm"
RPM_HASH = "3ffeb6987ead4d375a7822938f2f59f47cf19b52de632f0e12246917f211b110ce6d760e970fcb25196d668a9d86598ef33a0f4bfd90f08c30cd9273f594bf8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-svnkit-trilead-ssh2 \
mvn-com.jcraft-jsch.agentproxy.svnkit-trilead-ssh2 \
mvn-com.jcraft-jsch.agentproxy.svnkit-trilead-ssh2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-com.trilead-trilead-ssh2"

inherit rpm
