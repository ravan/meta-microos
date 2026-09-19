SUMMARY = "Apache Velocity - Engine parent pom"
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
This packages contains a parent pom needed for maven build"
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "velocity-engine-parent-2.4.1-1.4.noarch.rpm"
RPM_HASH = "32db0209b05ae22ffbf2a23224b21db0d6dd26f9b76336b490b79f95254d21ed9cadc8aa1eccd3ec29a0048a1c75e746088ac8432fbefa11113b7a329970bdd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity-engine-parent-pom- \
velocity-engine-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.velocity-velocity-master-pom-"

inherit rpm
