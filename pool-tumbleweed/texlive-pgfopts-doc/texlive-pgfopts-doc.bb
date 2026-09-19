SUMMARY = "Documentation for texlive-pgfopts"
DESCRIPTION = "This package includes the documentation for texlive-pgfopts"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1asvn77682"

RPM_NAME = "texlive-pgfopts-doc-2026.226.2.1asvn77682-58.2.noarch.rpm"
RPM_HASH = "3aa0fce2ef69304acc6b1c133e5932823f95e36fb34e4095194df8ad9943b1be359ae055a4c25dbf209645e96e5af76c50bfbf308a1233cc56a34d76e37a2d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfopts-doc"

RDEPENDS:${PN} += ""

inherit rpm
