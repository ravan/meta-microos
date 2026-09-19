SUMMARY = "Plexus Security Dispatcher Component"
DESCRIPTION = "Plexus Security Dispatcher Component"
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-sec-dispatcher-2.0-8.5.noarch.rpm"
RPM_HASH = "dd8f0b7a032b806bd02e56851241f5c0ce12c527607b25cb95c691ac786aacd116985f2f461ccd4723a29297a05df9349a90de4741590c961472f1608c2f9ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-sec-dispatcher \
mvn-org.codehaus.plexus-plexus-sec-dispatcher-pom- \
mvn-org.sonatype.plexus-plexus-sec-dispatcher \
mvn-org.sonatype.plexus-plexus-sec-dispatcher-pom- \
plexus-sec-dispatcher"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.codehaus.plexus-plexus-cipher \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
