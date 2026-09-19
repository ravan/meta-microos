SUMMARY = "Apache Velocity Tools - JSP support"
DESCRIPTION = " \
VelocityTools is an integrated collection of Velocity subprojects \
with the common goal of creating tools and infrastructure to speed \
and ease development of both web and non-web applications using the \
Velocity template engine. \
 \
Enables the use of Velocity under a JSP environment."
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "velocity-tools-view-jsp-3.2-1.5.noarch.rpm"
RPM_HASH = "ecadfbb5090011a5817c908e26bf4f49b444517cb3c341ea8c4435576cd1a680503e484d2d40920311f4cbea3e7da4a59be55345a38971aa946f31094365c528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity.tools-velocity-tools-view-jsp \
mvn-org.apache.velocity.tools-velocity-tools-view-jsp-pom- \
velocity-tools-view-jsp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.apache.velocity.tools-velocity-tools-view"

inherit rpm
