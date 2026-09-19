SUMMARY = "Documentation for texlive-datatool"
DESCRIPTION = "This package includes the documentation for texlive-datatool"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4.3svn77021"

RPM_NAME = "texlive-datatool-doc-2026.226.3.4.3svn77021-61.2.noarch.rpm"
RPM_HASH = "bb24130e0cf24067f73e4944dd9be11c0e0c1e1fbed26738c719046180e1e97cbcdcd55c2731f30fba5261413132a2acf087ebc79dd1f5f3378c47ec28f601d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datatool-doc"

RDEPENDS:${PN} += ""

inherit rpm
