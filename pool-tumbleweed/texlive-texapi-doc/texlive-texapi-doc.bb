SUMMARY = "Documentation for texlive-texapi"
DESCRIPTION = "This package includes the documentation for texlive-texapi"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.04svn54080"

RPM_NAME = "texlive-texapi-doc-2026.227.1.04svn54080-62.2.noarch.rpm"
RPM_HASH = "d46846ee5df2631f05373e0c97a728a973fc7a917621250d4102c391e9b1b0711a62da1f4e5e24ba9c01f644ff2ca7a4085fbd07ee85ef684ae264c8f09d833f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texapi-doc"

RDEPENDS:${PN} += ""

inherit rpm
