SUMMARY = "Documentation for texlive-uaclasses"
DESCRIPTION = "This package includes the documentation for texlive-uaclasses"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-uaclasses-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "7cc80357f4414f08571ae7d7ba31eb92cb90164c6204a85606ba016034ce32ac366cff4e12a1bbb440ba141ee3be0439c8bf2a8965fa64146c11828cb2e531a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uaclasses-doc"

RDEPENDS:${PN} += ""

inherit rpm
