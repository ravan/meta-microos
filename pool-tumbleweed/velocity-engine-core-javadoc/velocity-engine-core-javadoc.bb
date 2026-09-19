SUMMARY = "Javadoc for velocity-engine-core"
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
This package contains Javadoc documentation"
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "velocity-engine-core-javadoc-2.4.1-1.6.noarch.rpm"
RPM_HASH = "01b5984743800f845dd82829d78b19b96de2d98ce7f8a09eb46a65bd26f4e5b89d205c5499eb2143563fbf6eb7f1a8e920f851a5c7f9dc05866f2942e1c6e931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velocity-engine-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
