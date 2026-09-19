SUMMARY = "jsch-agent-proxy core module"
DESCRIPTION = "jsch-agent-proxy core module."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "jsch-agent-proxy-core-0.0.9-2.8.noarch.rpm"
RPM_HASH = "1c52631d37adc89ab658af71a501a343aa2d4995822b7d340ab2f47f941d2ba968b1d146b7cbed20e00a684c59336cfbcbffb7a5793f662699764b289c469455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-core \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-com.jcraft-jsch.agentproxy.core-pom- \
osgi-com.jcraft.jsch.agentproxy.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
