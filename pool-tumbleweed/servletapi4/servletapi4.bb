SUMMARY = "Java servlet and JSP implementation classes"
DESCRIPTION = "This subproject contains the source code for the implementation classes \
of the Java Servlet and JSP APIs (packages javax.servlet)."
LICENSE = "Apache-1.1"

PV = "4.0.4"

RPM_NAME = "servletapi4-4.0.4-302.6.noarch.rpm"
RPM_HASH = "f2176e01b1e1c8f22898fd03b9d07425d64937c8d6b09b7ccf69779f626466dc9bdd8468bea2d55567782d5960cbfd96563454739dd94a449f0a7d24660c7e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "servlet \
servlet22 \
servlet4 \
servletapi4"

RDEPENDS:${PN} += ""

inherit rpm
