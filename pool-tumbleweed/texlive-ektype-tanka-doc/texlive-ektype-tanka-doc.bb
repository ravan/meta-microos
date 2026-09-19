SUMMARY = "Documentation for texlive-ektype-tanka"
DESCRIPTION = "This package includes the documentation for texlive-ektype-tanka"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-doc-2026.226.0.0.2svn63255-61.4.noarch.rpm"
RPM_HASH = "b063a27088cd2b562a9cf7de12d6440829764c15f128becdb01e20d246f9359d69fdc31d66e90f96cbbed6b76e5730ea5a7b74f332edd01205dcd329c7b562fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hi) \
locale(texlive-ektype-tanka-doc-mr \
texlive-ektype-tanka-doc"

RDEPENDS:${PN} += ""

inherit rpm
