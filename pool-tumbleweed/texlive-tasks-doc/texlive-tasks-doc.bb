SUMMARY = "Documentation for texlive-tasks"
DESCRIPTION = "This package includes the documentation for texlive-tasks"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.4asvn77682"

RPM_NAME = "texlive-tasks-doc-2026.227.1.4asvn77682-62.2.noarch.rpm"
RPM_HASH = "879dd6db2d78cf8f5db8d1877efe3fe449b61e62f82b25e756f2ccca3f61f0c5d1c4944da39c0b86ee19e1294568e648763daf4135db56d90aea5bf1c3667ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tasks-doc"

RDEPENDS:${PN} += ""

inherit rpm
