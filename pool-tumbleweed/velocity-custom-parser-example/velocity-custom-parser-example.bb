SUMMARY = "Apache Velocity Custom Parser Example"
DESCRIPTION = " \
Velocity is a Java-based template engine. It permits anyone to use the \
simple yet powerful template language to reference objects defined in \
Java code. \
When Velocity is used for web development, Web designers can work in \
parallel with Java programmers to develop web sites according to the \
Model-View-Controller (MVC) model, meaning that web page designers can \
focus solely on creating a site that looks good, and programmers can \
focus solely on writing top-notch code. Velocity separates Java code \
from the web pages, making the web site more maintainable over the long \
run and providing a viable alternative to Java Server Pages (JSPs) or \
PHP. \
Velocity's capabilities reach well beyond the realm of web sites; for \
example, it can generate SQL and PostScript and XML (see Anakia for more \
information on XML transformations) from templates. It can be used \
either as a standalone utility for generating source code and reports, \
or as an integrated component of other systems. Velocity also provides \
template services for the Turbine web application framework. \
Velocity+Turbine provides a template service that will allow web \
applications to be developed according to a true MVC model. \
 \
This package contains Custom Parser Example for Apache Velocity."
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "velocity-custom-parser-example-2.4.1-1.4.noarch.rpm"
RPM_HASH = "ad94a89403f7b13f9e3dd2c034268da8d1524a273cc5c04cf27ef39cd225a0da25649f69b70a8f49580c4b15f43814345b5b1b9ae40664cfa9c80924fbff91c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity-custom-parser-example-pom- \
velocity-custom-parser-example"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-dependency-plugin \
mvn-org.apache.maven.plugins-maven-resources-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.apache.velocity-velocity-engine-parent-pom- \
mvn-org.codehaus.mojo-javacc-maven-plugin"

inherit rpm
