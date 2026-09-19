SUMMARY = "Javadoc for plexus-resources"
DESCRIPTION = "API documentation for plexus-resources."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "plexus-resources-javadoc-1.3.1-1.5.noarch.rpm"
RPM_HASH = "0faa43ad6d32f0614e6d4f98b0c67765d394a45b15276b506427ee62ce0abebe6c87875ec61c57caade44220e6a2ec6b4b341fd695de637e09a957ebaefd821d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-resources-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
