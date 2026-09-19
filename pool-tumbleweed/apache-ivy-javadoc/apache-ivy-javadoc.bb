SUMMARY = "API Documentation for ivy"
DESCRIPTION = "JavaDoc documentation for apache-ivy"
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "apache-ivy-javadoc-2.6.0-1.1.noarch.rpm"
RPM_HASH = "e6f6cac8426bead1af6f4ccf69d6c8691ada6e6594980d1d0d055c6c9783affbb50716dfff6c1e9643d073bac8602361da34702d8db6c369d4d256cbf7b69165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-ivy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
