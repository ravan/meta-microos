SUMMARY = "Documentation for texlive-create-theorem"
DESCRIPTION = "This package includes the documentation for texlive-create-theorem"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-create-theorem-doc-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "4e5e02de1614b6c5905911b112e98e6ca13da56e74458e3b168a3b6688c570f2621bb5903a6e7b2766e7b37ab88d929cb88971304e33e63e42b8898676d0b5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-create-theorem-doc"

RDEPENDS:${PN} += ""

inherit rpm
