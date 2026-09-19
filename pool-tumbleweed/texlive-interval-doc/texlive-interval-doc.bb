SUMMARY = "Documentation for texlive-interval"
DESCRIPTION = "This package includes the documentation for texlive-interval"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-interval-doc-2026.226.0.0.4svn77682-60.2.noarch.rpm"
RPM_HASH = "7415354a63678e31f0652c1aec3ecd9f05b752d12a690aa55a1b07c85e123b36d169ddedd5d571b54c949ccb3569af1ffbadb48351f11406a6a9edf403262533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interval-doc"

RDEPENDS:${PN} += ""

inherit rpm
