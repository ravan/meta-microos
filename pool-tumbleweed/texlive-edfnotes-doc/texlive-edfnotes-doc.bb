SUMMARY = "Documentation for texlive-edfnotes"
DESCRIPTION = "This package includes the documentation for texlive-edfnotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-doc-2026.226.0.0.6bsvn21540-61.4.noarch.rpm"
RPM_HASH = "8f20a5098939f468ab4e2635fc3e1ccda36a8dc6cf67a13b028092af276a70c6491bb462428715470dd5a9f1e064cc9565265af2eb5550c11ccfccbccca539e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edfnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
