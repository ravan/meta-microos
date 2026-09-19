SUMMARY = "Javadoc for plexus-xml"
DESCRIPTION = "Javadoc for plexus-xml."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "plexus-xml-javadoc-3.1.0-1.1.noarch.rpm"
RPM_HASH = "63829cc0cd372fa07998897c1426a17b0079796d18c984c8dfd1a9799e01be2f5e0665b7e684b27a4791c363fa3173cc50ef3b64e1aa013c040659b704ac911f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-xml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
