SUMMARY = "Documentation for texlive-framedsyntax"
DESCRIPTION = "This package includes the documentation for texlive-framedsyntax"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.8svn76790"

RPM_NAME = "texlive-framedsyntax-doc-2026.226.0.0.2.8svn76790-60.2.noarch.rpm"
RPM_HASH = "096fc66e2b474230c04948740ee1ba4f10a40e9877eaf3c3d155405dff06f0619392a4fccc978cc1cbf5f44c5f7003fc447c353642f8171d120a51ad3f3473c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-framedsyntax-doc"

RDEPENDS:${PN} += ""

inherit rpm
