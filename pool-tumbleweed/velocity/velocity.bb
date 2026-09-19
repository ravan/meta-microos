SUMMARY = "Java-based template engine"
DESCRIPTION = "Velocity is a Java-based template engine. It permits anyone to use the \
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
applications to be developed according to a true MVC model."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "velocity-1.7-15.9.noarch.rpm"
RPM_HASH = "93a042f9b3816b965571336dc51f31973351e5fa238ca49c6916e2d28689ea7c667dc77f3789c050576db73a6459f612ad2aded4f8da7f54fd6344f4e24ed923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity \
mvn-org.apache.velocity-velocity-pom- \
mvn-velocity-velocity \
mvn-velocity-velocity-pom- \
osgi-org.apache.velocity \
velocity"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-collections-commons-collections \
mvn-org.apache.commons-commons-lang3"

inherit rpm
