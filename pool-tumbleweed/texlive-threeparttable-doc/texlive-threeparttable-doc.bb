SUMMARY = "Documentation for texlive-threeparttable"
DESCRIPTION = "This package includes the documentation for texlive-threeparttable"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn77682"

RPM_NAME = "texlive-threeparttable-doc-2026.227.svn77682-62.2.noarch.rpm"
RPM_HASH = "5b07ae2bb2da7373fd4c98d9db878fc6c5754201b4e8aef8b47de3730e92526e2fe85b6a89926cd707d7e39bc8063d6637fa9d5ca6738d13500eac318c60f856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeparttable-doc"

RDEPENDS:${PN} += ""

inherit rpm
