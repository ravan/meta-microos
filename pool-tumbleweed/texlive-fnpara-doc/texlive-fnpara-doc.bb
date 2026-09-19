SUMMARY = "Documentation for texlive-fnpara"
DESCRIPTION = "This package includes the documentation for texlive-fnpara"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25607"

RPM_NAME = "texlive-fnpara-doc-2026.226.svn25607-60.2.noarch.rpm"
RPM_HASH = "668f4598beaebceefde91e021935843d9f5f4056231a05a885ccf2025685428cf9ef8dd06d300fa829248a7cd0ad4642cb72e011b6de04818446ae860c8574a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnpara-doc"

RDEPENDS:${PN} += ""

inherit rpm
