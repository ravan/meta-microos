SUMMARY = "Documentation for texlive-cstypo"
DESCRIPTION = "This package includes the documentation for texlive-cstypo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn41986"

RPM_NAME = "texlive-cstypo-doc-2026.226.0.0.03svn41986-61.2.noarch.rpm"
RPM_HASH = "bdce12001c9177b2263d011dd90a3aa9d8cda2386ce3673046ffa41dfb8f141957b2d906917e78c51958d1d35ea9fbd0688c447d3b0562715a75d87a81a1c2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cstypo-doc"

RDEPENDS:${PN} += ""

inherit rpm
