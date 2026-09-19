SUMMARY = "Javadoc for maven-remote-resources-plugin"
DESCRIPTION = "API documentation for maven-remote-resources-plugin."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-remote-resources-plugin-javadoc-3.3.0-1.7.noarch.rpm"
RPM_HASH = "f4d69ac1accaabd7c113161d662d094bc0da9be0cb8556a42229d7ac1dcd67fc69b5a40b8e956e5e2111412b7397273336160b71189e68182f6c5b1a1169dffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-remote-resources-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
