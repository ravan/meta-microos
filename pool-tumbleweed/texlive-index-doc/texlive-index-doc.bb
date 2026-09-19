SUMMARY = "Documentation for texlive-index"
DESCRIPTION = "This package includes the documentation for texlive-index"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.04svn77682"

RPM_NAME = "texlive-index-doc-2026.226.4.04svn77682-60.2.noarch.rpm"
RPM_HASH = "f00e93111b3ea73817c0d158fcc851b4bf8979373df847e7731084a8602eea0cd0bffc2c5c926c8a27f25acdc8daa39895473057583e19332172beeeda22194d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-index-doc"

RDEPENDS:${PN} += ""

inherit rpm
