SUMMARY = "An API for firing a maven build in a clean environment"
DESCRIPTION = "This API is concerned with firing a Maven build in a new JVM. It accomplishes \
its task by building up a conventional Maven command line from options given in \
the current request, along with those global options specified in the invoker \
itself. Once it has the command line, the invoker will execute it, and capture \
the resulting exit code or any exception thrown to signal a failure to execute. \
Input/output control can be specified using an InputStream and up to two \
InvocationOutputHandlers. \
 \
This is a replacement package for maven-shared-invoker"
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-invoker-3.3.0-2.6.noarch.rpm"
RPM_HASH = "6f93a7a1363393245e31acd04705ec67022772ff22a52f0b27160296454fd67536a1965342c6504e372609239e19618e6e976724a9f0968f8da8089447ba4c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.maven.shared-maven-invoker-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven.shared-maven-shared-utils"

inherit rpm
