SUMMARY = "Javadoc for maven-resources-plugin"
DESCRIPTION = "API documentation for maven-resources-plugin."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "maven-resources-plugin-javadoc-3.5.0-2.1.noarch.rpm"
RPM_HASH = "61882022e222a20ecdfa4a295bf3e3835b9d6678fde9d5a79b696351160891f76f14eca0903e12e2acf1f4446a3e2737665db8c006629c5ddd9d63a494d48a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resources-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
