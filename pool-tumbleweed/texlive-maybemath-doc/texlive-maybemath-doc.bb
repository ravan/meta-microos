SUMMARY = "Documentation for texlive-maybemath"
DESCRIPTION = "This package includes the documentation for texlive-maybemath"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-maybemath-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "80834db7c721964bd571f391af3796ead3a2fb4d9e58bf58646fd5baa1e708f273541b349bb9f2ed7c30348f4649a4e7cfd003ecc7a09c7dc4d1b104d0bdb535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maybemath-doc"

RDEPENDS:${PN} += ""

inherit rpm
