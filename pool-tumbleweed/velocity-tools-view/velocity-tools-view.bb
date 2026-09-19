SUMMARY = "Apache Velocity Tools - View tools"
DESCRIPTION = " \
VelocityTools is an integrated collection of Velocity subprojects \
with the common goal of creating tools and infrastructure to speed \
and ease development of both web and non-web applications using the \
Velocity template engine. \
 \
Tools to be used in a servlet context."
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "velocity-tools-view-3.2-1.5.noarch.rpm"
RPM_HASH = "04fd8fc7e4b955c2a2a6b3b0f11f910f688fb3cdd74f7d295cd2ba902390878861dee0d33c5d26b56f887d34e27dec1d6b71f83dff767132cd14bf86c1ca43df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity.tools-velocity-tools-view \
mvn-org.apache.velocity.tools-velocity-tools-view-pom- \
velocity-tools-view"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-digester3 \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.apache.velocity.tools-velocity-tools-generic \
mvn-org.slf4j-slf4j-api"

inherit rpm
