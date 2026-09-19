SUMMARY = "Maven Archiver"
DESCRIPTION = "The Maven Archiver is used by other Maven plugins \
to handle packaging"
LICENSE = "Apache-2.0"

PV = "3.6.6"

RPM_NAME = "maven-archiver-3.6.6-1.4.noarch.rpm"
RPM_HASH = "36b3701ed769c4b2fd3c7af76e2e454326f7f2f19d6d24cb0d4a1622e8fa1addceb0e8f88fb72df1ba5226911bf8f7dd79f4b8e9cb9cf5b3cd3862c69cfeb7b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-archiver-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
