SUMMARY = "API documentation for all plexus-containers packages"
DESCRIPTION = "API documentation for all plexus-containers packages."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.2.0"

RPM_NAME = "plexus-containers-javadoc-2.2.0-3.1.noarch.rpm"
RPM_HASH = "6b01eee5de7cb10a118c417ea5844349c6eca38642f970292e3a81bea5545b85a476bd06b8ed18b7dd4813f629d4e1665b6e72e04a760f920b39a4368e4f0032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-containers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
