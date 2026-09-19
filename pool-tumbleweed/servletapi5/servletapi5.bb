SUMMARY = "Java servlet and JSP implementation classes"
DESCRIPTION = "This subproject contains the source code for the implementation classes \
of the Java Servlet and JSP APIs (packages javax.servlet)."
LICENSE = "Apache-2.0"

PV = "5.0.18"

RPM_NAME = "servletapi5-5.0.18-289.6.noarch.rpm"
RPM_HASH = "177db90ac1ea2e1d9e61d01bf748e56498a582c1b34121ddf26169eb7a25223b5b039f38816c68b2850e952220c4b781572f8f8c12854b0409a11763286a3952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "servlet \
servlet24 \
servlet5 \
servletapi5"

RDEPENDS:${PN} += ""

inherit rpm
