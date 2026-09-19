SUMMARY = "Documentation for texlive-luatikz"
DESCRIPTION = "This package includes the documentation for texlive-luatikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12.0svn73087"

RPM_NAME = "texlive-luatikz-doc-2026.226.2.12.0svn73087-59.2.noarch.rpm"
RPM_HASH = "13141156e36bc34baf6f89ea316e6e8fac4e2369af565169d3376bbb061402b94fddc7051875377616ad1ca2154f7491d3771e090308f1d55cb1356673fd1e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
