SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers. \
 \
This package implements a set of basic commands."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "felix-gogo-command-1.1.2-4.4.noarch.rpm"
RPM_HASH = "fa97e5ff280c5ffaf16a6bd5ae4daf0a6560ee6a7bff3aeb612604b68230aaed3a9ab251925b76a2d242725db2606a6531292530b765bcf572042404c16cfaca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-command \
mvn-org.apache.felix-org.apache.felix.gogo.command \
mvn-org.apache.felix-org.apache.felix.gogo.command-pom- \
osgi-org.apache.felix.gogo.command"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-org.apache.felix.gogo.runtime"

inherit rpm
