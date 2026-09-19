SUMMARY = "Jetty parent POM file"
DESCRIPTION = "Jetty parent POM file"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "25"

RPM_NAME = "jetty-parent-25-1.29.noarch.rpm"
RPM_HASH = "6a6075bf60198dd1fac15c29cc210a96532336366ada5dba11959854bf61709bd5cad144425102720fc77b990994257b2001e49a87d39f32fa54071cc4905ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-parent \
mvn-org.eclipse.jetty-jetty-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
