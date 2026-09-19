SUMMARY = "Javadoc for maven-archiver4"
DESCRIPTION = "Javadoc for maven-archiver4."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta5"

RPM_NAME = "maven-archiver4-javadoc-4.0.0~beta5-2.4.noarch.rpm"
RPM_HASH = "db53e8f08955780775c60836a0565533ba1d931032b4e53b3e17c98916b3cb3fd5227faad18ed3d27b5a2a51f2a603c0507a5831bdc66f800da935739b3df4e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
