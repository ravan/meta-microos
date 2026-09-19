SUMMARY = "Javadoc for maven-surefire-plugins"
DESCRIPTION = "Javadoc for maven-surefire-plugins."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "3.6.0"

RPM_NAME = "maven-surefire-plugins-javadoc-3.6.0-1.1.noarch.rpm"
RPM_HASH = "409d18321df952d4448a26f6ab749eef27e47fc0c25154bf98d63666cbd4f952be9643f4e213bd814a3c3734c9644a528aa4a985e5207a49fdc6165d257f98af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-plugins-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
