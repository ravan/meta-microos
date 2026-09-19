SUMMARY = "Javadoc for plexus-archiver"
DESCRIPTION = "Javadoc for plexus-archiver."
LICENSE = "Apache-2.0"

PV = "4.12.0"

RPM_NAME = "plexus-archiver-javadoc-4.12.0-1.2.noarch.rpm"
RPM_HASH = "a34d4871080d4496b96de6ffc61e2bebf745eff0099e54f871263c850ddf2bf472c516d0bd15b38de7825b4799d065e4a016f665cb16c96a4754b29698fedbe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-archiver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
