SUMMARY = "Build Number Maven Plugin"
DESCRIPTION = "This mojo is designed to get a unique build number for each time you build \
your project. So while your version may remain constant at 1.0-SNAPSHOT \
for many iterations until release, you will have a build number that can \
uniquely identify each build during that time. The build number is obtained \
from scm, and in particular, at this time, from svn. You can then place that \
build number in metadata, which can be accessed from your app, if desired. \
 \
The mojo also has a couple of extra functions to ensure you get the proper \
build number. First, your local repository is checked to make sure it is \
up to date. Second, your local repository is automatically updated, so that \
you get the latest build number. Both these functions can be suppressed, \
if desired. \
 \
Optionally, you can configure this mojo to produce a revision based on a \
timestamp, or on a sequence, without requiring any interaction with an \
SCM system. Note that currently, the only supported SCM is subversion."
LICENSE = "Apache-2.0 & MIT"

PV = "3.3.0"

RPM_NAME = "buildnumber-maven-plugin-3.3.0-1.2.noarch.rpm"
RPM_HASH = "1c0a05f91bdf1980b44c62e73c768de1fcc638061e1d2305c84edcbbd5e7e991ca43eebadbc5d2613f2354966e143ed0898831a2b0bebc3afd471188a124dd6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildnumber-maven-plugin \
mvn-org.codehaus.mojo-buildnumber-maven-plugin \
mvn-org.codehaus.mojo-buildnumber-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.gson-gson \
mvn-org.apache.maven.scm-maven-scm-api \
mvn-org.apache.maven.scm-maven-scm-manager-plexus \
mvn-org.apache.maven.scm-maven-scm-provider-gitexe \
mvn-org.apache.maven.scm-maven-scm-provider-hg \
mvn-org.apache.maven.scm-maven-scm-provider-svn-commons \
mvn-org.apache.maven.scm-maven-scm-provider-svnexe \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.sonatype.plexus-plexus-sec-dispatcher"

inherit rpm
