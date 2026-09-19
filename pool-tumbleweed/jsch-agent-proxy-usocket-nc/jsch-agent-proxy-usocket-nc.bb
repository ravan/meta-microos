SUMMARY = "USocketFactory implementation using Netcat"
DESCRIPTION = "USocketFactory implementation using Netcat."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "jsch-agent-proxy-usocket-nc-0.0.9-2.8.noarch.rpm"
RPM_HASH = "c3cea3e044a86e81836eece71fcdfc4a2e193c05ee17cef36174b979ab2676a3e80bcdbc7f4a90f1b0b47320c1fb68c4f334ff37d291f474abe8871de68842a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-usocket-nc \
mvn-com.jcraft-jsch.agentproxy.usocket-nc \
mvn-com.jcraft-jsch.agentproxy.usocket-nc-pom- \
osgi-com.jcraft.jsch.agentproxy.usocket-nc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core"

inherit rpm
