SUMMARY = "Documentation for texlive-harvmac"
DESCRIPTION = "This package includes the documentation for texlive-harvmac"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-harvmac-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "7ac78c61277f310b95e8d0bde8b557be3029f9152654e415975673f636a8be841a25e81f3e12e6cdd7a1ebaba3cc6d1252d296182ae74190125e528097a243df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
