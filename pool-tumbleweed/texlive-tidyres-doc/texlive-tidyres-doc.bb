SUMMARY = "Documentation for texlive-tidyres"
DESCRIPTION = "This package includes the documentation for texlive-tidyres"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0.0svn67738"

RPM_NAME = "texlive-tidyres-doc-2026.227.2.0.0svn67738-62.2.noarch.rpm"
RPM_HASH = "4200c9f6c9fa9b9996e1e0c4acabc965ce32b6fc5d2b7910b8ef4042f4ebc28380b11e19222468f36e157e2a00ec2df6641dbe22800dd199f19a755e5c0a687a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tidyres-doc"

RDEPENDS:${PN} += ""

inherit rpm
