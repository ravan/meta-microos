SUMMARY = "Javadoc for plexus-cipher"
DESCRIPTION = "API documentation for plexus-cipher."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "plexus-cipher-javadoc-2.1.0-2.5.noarch.rpm"
RPM_HASH = "53ad409fe1cda4c562b9bf9ccd0b051b3f312de82f0ae86df5e57778cbdc653567cb5e875ab6da7276474711b669a094fa8ea50afc5d7a7c916db1c00fd85436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-cipher-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
