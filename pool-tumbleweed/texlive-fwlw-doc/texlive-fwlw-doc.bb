SUMMARY = "Documentation for texlive-fwlw"
DESCRIPTION = "This package includes the documentation for texlive-fwlw"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-fwlw-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "568fe8876380086a194dd1665aff96b9c8a94cf20587f155277414b7dce592687efa0d7c2e27ce6bc09ace39d5299c76e09cb7c4d39003d76ec06b139d50b215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fwlw-doc"

RDEPENDS:${PN} += ""

inherit rpm
