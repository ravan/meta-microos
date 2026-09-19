SUMMARY = "Javadoc for plexus-classworlds"
DESCRIPTION = "API documentation for plexus-classworlds."
LICENSE = "Apache-2.0 & Plexus"

PV = "2.12.0"

RPM_NAME = "plexus-classworlds-javadoc-2.12.0-1.3.noarch.rpm"
RPM_HASH = "4135ab4c67a33e2174a986b5e40807fddc3c9c567045ae4250b678f82971d03b7e032098563e3cb2f325dca3a840d00bdad31c16f4ebc177beb97e7d2a37e282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-classworlds-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
