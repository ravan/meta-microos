SUMMARY = "Documentation for texlive-subsupscripts"
DESCRIPTION = "This package includes the documentation for texlive-subsupscripts"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn16080"

RPM_NAME = "texlive-subsupscripts-doc-2026.226.1.0svn16080-64.2.noarch.rpm"
RPM_HASH = "a3a94b8c7c8f86347c4f14680fa71ae56b1a970fccd1d9f24a418cf7a32c7bd09d805fadb9bab7bd8ccc92f49a526c0aa5b7067fd80d32aa7af888cde6b08db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subsupscripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
