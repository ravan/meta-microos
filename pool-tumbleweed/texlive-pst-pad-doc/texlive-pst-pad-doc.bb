SUMMARY = "Documentation for texlive-pst-pad"
DESCRIPTION = "This package includes the documentation for texlive-pst-pad"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3bsvn15878"

RPM_NAME = "texlive-pst-pad-doc-2026.226.0.0.3bsvn15878-59.2.noarch.rpm"
RPM_HASH = "2ac15eb2b00959bdcf5ea9b95fd6ece8e75e8a0c70e926aed469fc3215a1beb3ae2161b5440d7f8feefe5174bc271d4e6486a563f0bc783cebd1f9937fc53bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-pad-doc-en;de \
texlive-pst-pad-doc"

RDEPENDS:${PN} += ""

inherit rpm
