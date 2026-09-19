SUMMARY = "Javadoc for jboss-logmanager"
DESCRIPTION = "This package contains the API documentation for jboss-logmanager."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "jboss-logmanager-javadoc-2.0.4-3.17.noarch.rpm"
RPM_HASH = "27b2a7612fb340da38845c89c1221739b9705bae061c63cf8f0b312fd04d1d6e85b902e6a5ae50d83e4139ad9095edfc5f93e0b7bd465666b76ba12239055ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logmanager-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
