SUMMARY = "USocketFactory implementation using JNA"
DESCRIPTION = "USocketFactory implementation using JNA."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "jsch-agent-proxy-usocket-jna-0.0.9-2.8.noarch.rpm"
RPM_HASH = "99fd33bde0efacde78fa5a4b9606ad2d332497f21c31adea04b92ea5d19f8406ab3d6db14668fa5fff96a646bbd8af3d3ac8d40ff98f98dc86986c72196270d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-usocket-jna \
mvn-com.jcraft-jsch.agentproxy.usocket-jna \
mvn-com.jcraft-jsch.agentproxy.usocket-jna-pom- \
osgi-com.jcraft.jsch.agentproxy.usocket-jna"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-net.java.dev.jna-jna \
mvn-net.java.dev.jna-jna-platform"

inherit rpm
