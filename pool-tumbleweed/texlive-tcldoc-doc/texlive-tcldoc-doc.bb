SUMMARY = "Documentation for texlive-tcldoc"
DESCRIPTION = "This package includes the documentation for texlive-tcldoc"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.40svn22018"

RPM_NAME = "texlive-tcldoc-doc-2026.227.2.40svn22018-62.2.noarch.rpm"
RPM_HASH = "30debc9de74ac704eebaedae5101d535b9bfb620aeec8dc3d35fa2c37a7eff308bade8d4a4cb741755ec87c4b68faa535b37ce0063d1f9aa86017aec391a6461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tcldoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
