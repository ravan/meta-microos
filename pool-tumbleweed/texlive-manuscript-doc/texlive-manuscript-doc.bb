SUMMARY = "Documentation for texlive-manuscript"
DESCRIPTION = "This package includes the documentation for texlive-manuscript"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn36110"

RPM_NAME = "texlive-manuscript-doc-2026.226.1.7svn36110-59.2.noarch.rpm"
RPM_HASH = "30702e9c16a79ab6e56e0be14a1cd905872efd6075d94c8dba47c9589a533ce4e799710cb1f6a56f7c537159fa7c2e7818e3c135ae64be3472003cd192e2b7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-manuscript-doc"

RDEPENDS:${PN} += ""

inherit rpm
