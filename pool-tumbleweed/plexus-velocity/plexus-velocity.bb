SUMMARY = "Plexus Velocity Component"
DESCRIPTION = "This package provides Plexus Velocity component - a wrapper for \
Apache Velocity template engine, which allows easy use of Velocity \
by applications built on top of Plexus container."
LICENSE = "Apache-2.0"

PV = "2.3.0"

RPM_NAME = "plexus-velocity-2.3.0-1.4.noarch.rpm"
RPM_HASH = "50a40a78365b1654ff9154b44617c453313188bd6aa75104070796ef0611ac37edeec78a5db675bdb17bfe98fb7efc4acafe8849a1e3977306ab14d66e869e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-velocity \
mvn-org.codehaus.plexus-plexus-velocity-pom- \
plexus-velocity"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.slf4j-slf4j-api"

inherit rpm
