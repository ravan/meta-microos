SUMMARY = "Documentation for texlive-lambda-lists"
DESCRIPTION = "This package includes the documentation for texlive-lambda-lists"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn31402"

RPM_NAME = "texlive-lambda-lists-doc-2026.226.svn31402-63.2.noarch.rpm"
RPM_HASH = "17cbf29c39d5c6c6b0726b2909dc42d832b1b2cdb540bf3bc46c77116a53fb24daa6afbda627859e9220fd3bfa5feaf037a7a3dd68756267d4d4e488970964eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lambda-lists-doc"

RDEPENDS:${PN} += ""

inherit rpm
