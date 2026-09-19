SUMMARY = "Javadoc for servletapi4"
DESCRIPTION = "This subproject contains the source code for the implementation classes \
of the Java Servlet and JSP APIs (packages javax.servlet). This package \
contains the javadoc documentation for the Java Servlet and JSP APIs."
LICENSE = "Apache-1.1"

PV = "4.0.4"

RPM_NAME = "servletapi4-javadoc-4.0.4-302.6.noarch.rpm"
RPM_HASH = "28bf6fc0664196258e67be4e273349e740bfd632e8fdd98ae9213c55be81d12ae4f49bc04f96f23d9558b25ae176caede24a0a03928880bb5ba81203117a3d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "servletapi4-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
