SUMMARY = "Documentation for texlive-jamtimes"
DESCRIPTION = "This package includes the documentation for texlive-jamtimes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn20408"

RPM_NAME = "texlive-jamtimes-doc-2026.226.1.12svn20408-63.2.noarch.rpm"
RPM_HASH = "c9834d27568077857957f3dba98071734a209279459f7f5859c12b1dddfc03782cb3e3d994148c383b3e57e5edb4c344d1cc609f3d8eb0e0ca0c9e27d18aaac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jamtimes-doc"

RDEPENDS:${PN} += ""

inherit rpm
