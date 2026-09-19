SUMMARY = "Apache Velocity Engine - Examples"
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
This package contains very simple examples to use Velocity."
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "velocity-engine-examples-2.4.1-1.4.noarch.rpm"
RPM_HASH = "ed2d106eac4b32e2e0a84977461bac32cec4f9632a6ba24e7eb5aabee411ec1400ff12eb797f09e94433c208e4cb77a4360dbe77f8c7d43aa3690ac45addfa67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity-engine-examples \
mvn-org.apache.velocity-velocity-engine-examples-pom- \
osgi-org.apache.velocity.engine-examples \
velocity-engine-examples"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.dom4j-dom4j"

inherit rpm
