SUMMARY = "Documentation for texlive-curve2e"
DESCRIPTION = "This package includes the documentation for texlive-curve2e"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6.0svn77682"

RPM_NAME = "texlive-curve2e-doc-2026.226.2.6.0svn77682-61.2.noarch.rpm"
RPM_HASH = "d5993dc3d3cbae246ee279f0fbe69e74e34c6fd656612115e3a2fa3ff2918cb52ec166c0fa7e8e50785264263a669e9622da7d9c4785cef8b8c854b713a9b9e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curve2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
