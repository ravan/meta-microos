SUMMARY = "Maven Invoker Plugin"
DESCRIPTION = "The Maven Invoker Plugin is used to run a set of Maven projects. The plugin \
can determine whether each project execution is successful, and optionally \
can verify the output generated from a given project execution."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "maven-invoker-plugin-3.10.1-1.2.noarch.rpm"
RPM_HASH = "f3d60cadb4ea4fab728e96131697c564ff3cdce2437204e5a8712b4bb37cfecba060ff7e16c1123e623907f2fb514f3e769de0862506a8e5effd26c6071008aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker-plugin \
mvn-org.apache.maven.plugins-maven-invoker-plugin \
mvn-org.apache.maven.plugins-maven-invoker-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-extras.beanshell-bsh \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.maven.shared-maven-script-interpreter \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api"

inherit rpm
