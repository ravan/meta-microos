SUMMARY = "Documentation for texlive-tikzpagenodes"
DESCRIPTION = "This package includes the documentation for texlive-tikzpagenodes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn64967"

RPM_NAME = "texlive-tikzpagenodes-doc-2026.226.1.1svn64967-59.2.noarch.rpm"
RPM_HASH = "28e0daed096c0d596c21b4fe794d719c2642e278bd4ec6b5441ac012167e6d6eca74f986565e213a665e7f1727b0ebe9d0403f9201d2c3ae1246ebdbbfb85d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpagenodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
