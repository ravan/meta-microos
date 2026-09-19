SUMMARY = "Documentation for texlive-modulus"
DESCRIPTION = "This package includes the documentation for texlive-modulus"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47599"

RPM_NAME = "texlive-modulus-doc-2026.226.1.0svn47599-61.2.noarch.rpm"
RPM_HASH = "b55456bc54f3696061b2ffb54e7b5b983381b216cdb22b2df14f71e7e8ce04db9d71274011fddf506a0d9b231e0275535c62750e39409114ae1176beabb76f69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modulus-doc"

RDEPENDS:${PN} += ""

inherit rpm
