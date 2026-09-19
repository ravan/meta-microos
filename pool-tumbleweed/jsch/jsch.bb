SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.2.22"

RPM_NAME = "jsch-0.2.22-1.7.noarch.rpm"
RPM_HASH = "54ef08162f4adf4078f6470e56652ff3bdead64008b04c957245b4bf1eb9f8fe780369a12a2e42236e1d230ce6c1347afe1f95afd840eb5e7d45a57fec29c0f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch \
mvn-com.github.mwiede-jsch \
mvn-com.github.mwiede-jsch-pom- \
mvn-com.jcraft-jsch \
mvn-com.jcraft-jsch-pom- \
osgi-com.jcraft.jsch"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
