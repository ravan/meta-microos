SUMMARY = "Maven Remote Resources Plugin"
DESCRIPTION = "Process resources packaged in JARs that have been deployed to \
a remote repository. The primary use case being satisfied is \
the consistent inclusion of common resources in a large set of \
projects. Maven projects at Apache use this plug-in to satisfy \
licensing requirements at Apache where each project much include \
license and notice files for each release."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-remote-resources-plugin-3.3.0-1.7.noarch.rpm"
RPM_HASH = "23215eda80be325ea5c59e8d68b0dd104b0d727eb8bc568132013b65cc78fe237aa4d0653ad6ea84f0241c9a1b913ea6680f8404c4787a90c3d1fd7c2848ca6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-remote-resources-plugin \
mvn-org.apache.maven.plugins-maven-remote-resources-plugin \
mvn-org.apache.maven.plugins-maven-remote-resources-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.codehaus.plexus-plexus-resources \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
