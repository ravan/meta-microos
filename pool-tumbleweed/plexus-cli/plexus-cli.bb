SUMMARY = "Command Line Interface facilitator for Plexus"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "plexus-cli-1.7-1.8.noarch.rpm"
RPM_HASH = "4db439671b46a3d54ac70e6e7612870f8b1138505d267b53b7954cb088809d8071866d79730eda6f359cd55e7cea683c8a3b5545e1c3162df2547ef4b9b09a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-cli \
mvn-org.codehaus.plexus-plexus-cli-pom- \
plexus-cli"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-cli-commons-cli \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus"

inherit rpm
