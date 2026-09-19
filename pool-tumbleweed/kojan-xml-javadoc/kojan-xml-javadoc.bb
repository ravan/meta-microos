SUMMARY = "Javadoc for kojan-xml"
DESCRIPTION = "Javadoc for kojan-xml."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "kojan-xml-javadoc-1.0.1-1.5.noarch.rpm"
RPM_HASH = "155af52ac6c392181a05c124107846b3a36305cbb030f7e95134c9a248e2640fa0fe8a0b3dba18efb30c38149438026aedba86c9bd95827d5a71487bb37ae28f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kojan-xml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
