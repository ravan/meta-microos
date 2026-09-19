SUMMARY = "Documentation for texlive-drv"
DESCRIPTION = "This package includes the documentation for texlive-drv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.97svn29349"

RPM_NAME = "texlive-drv-doc-2026.226.0.0.97svn29349-59.2.noarch.rpm"
RPM_HASH = "4c974872349fed21eb1827ccf2eecd1fc25ea0588af8431d2a7c9f2f4997a42f6d5cc92823355d92a89890bbbdb081471ee65b264dbc68cbe46c710c350edf0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drv-doc"

RDEPENDS:${PN} += ""

inherit rpm
