SUMMARY = "API documentation for maven"
DESCRIPTION = "API documentation for maven."
LICENSE = "Apache-2.0 & MIT"

PV = "3.10.0~rc1"

RPM_NAME = "maven-javadoc-3.10.0~rc1-1.1.noarch.rpm"
RPM_HASH = "2861e0590313496949f5dc970d16cecfc33b8560c4c2ec8441bfd18cd31633a7e6134bf877d8589f4bf25248d8ac5044bb40bfce294048c9ed343462297d13ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
