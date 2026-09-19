SUMMARY = "Documentation for texlive-fontawesome7"
DESCRIPTION = "This package includes the documentation for texlive-fontawesome7"
LICENSE = "OFL-1.1"

PV = "2026.226.7.1.0_1svn76735"

RPM_NAME = "texlive-fontawesome7-doc-2026.226.7.1.0_1svn76735-60.2.noarch.rpm"
RPM_HASH = "2c70bd045a32b1d2e13af0a07a0d41048814b801bb3eb9577a7e45f8a2f71685068e9164e6aa6028af02a47ac27755ea25d36154db4e003224232dbf7b39f42e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontawesome7-doc"

RDEPENDS:${PN} += ""

inherit rpm
