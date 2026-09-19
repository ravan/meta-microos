SUMMARY = "Documentation for texlive-filehook"
DESCRIPTION = "This package includes the documentation for texlive-filehook"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8bsvn77682"

RPM_NAME = "texlive-filehook-doc-2026.226.0.0.8bsvn77682-59.2.noarch.rpm"
RPM_HASH = "cbb42196fc2a5b2ee11cf4d0e6c0c03660b2d59943ddd0f70e517883e4ea8fae3b9d2fb9baefe7d32de04c0bf2c279a05de6d82d2f23424235b9fffdb0bc70d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filehook-doc"

RDEPENDS:${PN} += ""

inherit rpm
