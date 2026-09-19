SUMMARY = "Documentation for texlive-memexsupp"
DESCRIPTION = "This package includes the documentation for texlive-memexsupp"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-memexsupp-doc-2026.226.0.0.1svn15878-59.2.noarch.rpm"
RPM_HASH = "268564e2d1073ee1a35b602c532dd789622e3ad62ff60abcb45ef9c62198d8cafe6b94b2d28c145bb31f9aa97429223851289b86058bdd6f494e1fd4c9d12d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memexsupp-doc"

RDEPENDS:${PN} += ""

inherit rpm
