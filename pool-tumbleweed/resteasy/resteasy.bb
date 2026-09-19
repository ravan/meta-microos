SUMMARY = "Framework for RESTful Web services and Java applications"
DESCRIPTION = " \
 \
 \
 \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-3.0.26-4.17.noarch.rpm"
RPM_HASH = "c9c05fa21897452c431ec299b03f9474834584e5c71c1fe59037cce46fc1d138319eca2ad694b1d0b9ece18ef227881825a43bcd43dd08f913d9f6136f5ea811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "resteasy"

RDEPENDS:${PN} += "resteasy-atom-provider \
resteasy-client \
resteasy-core \
resteasy-jackson2-provider \
resteasy-jaxb-provider"

inherit rpm
