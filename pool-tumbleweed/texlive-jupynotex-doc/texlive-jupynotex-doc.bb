SUMMARY = "Documentation for texlive-jupynotex"
DESCRIPTION = "This package includes the documentation for texlive-jupynotex"
LICENSE = "Apache-1.0"

PV = "2026.226.1.1svn75037"

RPM_NAME = "texlive-jupynotex-doc-2026.226.1.1svn75037-63.2.noarch.rpm"
RPM_HASH = "993a505916e7eba6a00ba764566a5f6df5633634dd5de9a12152a48234f51556b391fdda715c378036883b2f929d2bd785a86c73351a8ddaf377d980aff6f03e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jupynotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
