SUMMARY = "Parent POM for signpost-core"
DESCRIPTION = "This package contains the Parent POM for signpost-core."
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "oauth-signpost-1.2.1.2-3.20.noarch.rpm"
RPM_HASH = "8f61e0110419595289f6bedf0bbe8d9edfbf333471b5abfbe4e77ea806d6a9906a68731d4557a359e5612ddf079db171fccd549ee6e231430f56cdbfc7df95b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-oauth.signpost-oauth-signpost-pom- \
oauth-signpost"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin"

inherit rpm
