SUMMARY = "JBoss Marshalling"
DESCRIPTION = "JBoss Marshalling is an alternative serialization API that fixes many \
of the problems found in the JDK serialization API while remaining \
fully compatible with java.io.Serializable and its relatives, and adds \
several new tunable parameters and additional features, all of which \
are pluggable via factory configuration (externalizers, class/instance \
lookup tables, class resolution, and object replacement, to name a \
few)."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-1.4.11-3.17.noarch.rpm"
RPM_HASH = "d4bc574895dde7af045784bc3e437af4f8106e111c3b8bfe2a33b5a86e1485796461213668f4d8e277f6a30d01b298147de344881674577b160c7f55dab232f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling \
mvn-org.jboss.marshalling-jboss-marshalling \
mvn-org.jboss.marshalling-jboss-marshalling-parent-pom- \
mvn-org.jboss.marshalling-jboss-marshalling-pom- \
mvn-org.jboss.marshalling-jboss-marshalling-river \
mvn-org.jboss.marshalling-jboss-marshalling-river-pom- \
mvn-org.jboss.marshalling-jboss-marshalling-serial \
mvn-org.jboss.marshalling-jboss-marshalling-serial-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
