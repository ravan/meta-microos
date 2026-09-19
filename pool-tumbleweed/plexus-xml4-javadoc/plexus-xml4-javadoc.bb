SUMMARY = "Javadoc for plexus-xml4"
DESCRIPTION = "Javadoc for plexus-xml4."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "plexus-xml4-javadoc-4.1.1-1.4.noarch.rpm"
RPM_HASH = "f4d72990cf5b35c91df2f8d56f90e547fed712750d174b51df39589bca0526403718f38c087b452674c08c456e5e83362be97c6398a3f278dde2dfa6d3876285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-xml4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
