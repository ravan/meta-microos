SUMMARY = "Plexus Common Utilities"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-1.1 & Apache-2.0 & xpp & BSD-3-Clause & LicenseRef-SUSE-Public-Domain"

PV = "4.1.0"

RPM_NAME = "plexus-utils-4.1.0-1.1.noarch.rpm"
RPM_HASH = "b5091adadf2210ef41ca61acf36d37384a6eafa9d97890105cba457f31938efd1ac55ef5cd14174fd6122a341b5601ad288faa570346028e9697c908e53700df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-utils-pom- \
mvn-plexus-plexus-utils \
mvn-plexus-plexus-utils-pom- \
plexus-utils"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
