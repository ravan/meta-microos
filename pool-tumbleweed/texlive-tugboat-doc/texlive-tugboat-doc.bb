SUMMARY = "Documentation for texlive-tugboat"
DESCRIPTION = "This package includes the documentation for texlive-tugboat"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.36svn77682"

RPM_NAME = "texlive-tugboat-doc-2026.226.2.36svn77682-59.2.noarch.rpm"
RPM_HASH = "d004abecbcbd0a6a2c88f4ffa724f57e9253aa0767ec62714abfc20150f67886e3ef6c3944060f44c51a0716ea7ab326eb1caa7f39ae253b4ce1f889ffa2f0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tugboat-doc"

RDEPENDS:${PN} += ""

inherit rpm
