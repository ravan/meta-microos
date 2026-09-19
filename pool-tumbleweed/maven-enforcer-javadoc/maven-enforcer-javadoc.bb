SUMMARY = "Javadoc for maven-enforcer"
DESCRIPTION = "API documentation for maven-enforcer."
LICENSE = "Apache-2.0"

PV = "3.6.3"

RPM_NAME = "maven-enforcer-javadoc-3.6.3-1.2.noarch.rpm"
RPM_HASH = "a0a7dfc4ba9c54eac2eec0878d648c08dc081596555f5d0fe5a904ade4f67fa3095022613a20e5826a73e21e434df2a97748255a1af267d2771854eeaa597e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
