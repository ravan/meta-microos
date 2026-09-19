SUMMARY = "Documentation for texlive-graphics-cfg"
DESCRIPTION = "This package includes the documentation for texlive-graphics-cfg"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn41448"

RPM_NAME = "texlive-graphics-cfg-doc-2026.226.svn41448-60.4.noarch.rpm"
RPM_HASH = "2be4237534ce170fbbd2167230d4e20ed984cd8cbb12c62ad4e6944d5df353602a31e53bfe823145900014dea48418869b5afed5ac2b8dd6f540d4cf3b873d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-cfg-doc"

RDEPENDS:${PN} += ""

inherit rpm
