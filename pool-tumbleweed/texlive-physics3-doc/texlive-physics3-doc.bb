SUMMARY = "Documentation for texlive-physics3"
DESCRIPTION = "This package includes the documentation for texlive-physics3"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn77682"

RPM_NAME = "texlive-physics3-doc-2026.226.0.0.2asvn77682-58.2.noarch.rpm"
RPM_HASH = "a034ea747a3ad3ae3ff4a7a8fc60c05b4466725990cf5cdcf8f4f90499d76c3bcf1a1172b075be3c4b9ef2bc9db32798a7e7107e95649a9a2515f746f8d10689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physics3-doc"

RDEPENDS:${PN} += ""

inherit rpm
