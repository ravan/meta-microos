SUMMARY = "API documentation for apache-chainsaw"
DESCRIPTION = "API documentation for apache-chainsaw."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "apache-chainsaw-javadoc-2.1.0-5.10.noarch.rpm"
RPM_HASH = "8daa58581d8ac956e15f31fb1125fd84e6a1c5875ded00d1430054d4e13333bc92281736bb2f932d573b98de1f0b2878443f3b330a7ffba1c1ccbf0c18397e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-chainsaw-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
