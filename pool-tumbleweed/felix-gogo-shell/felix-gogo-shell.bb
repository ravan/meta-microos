SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers. \
 \
This package provides a simple textual user interface to interact with the \
command processor."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "felix-gogo-shell-1.1.4-3.4.noarch.rpm"
RPM_HASH = "7ff1637fb66e55f7c9766aefe49d495fe2a63667aff6923183a6bbcef94b38ae967d54918767b1fb4d0594615ff3cc59d0ddfc28ff5fb599b0aa4a085f455356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-shell \
mvn-org.apache.felix-org.apache.felix.gogo.shell \
mvn-org.apache.felix-org.apache.felix.gogo.shell-pom- \
osgi-org.apache.felix.gogo.shell"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-org.apache.felix.gogo.runtime"

inherit rpm
