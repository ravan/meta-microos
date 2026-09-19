SUMMARY = "Documentation for texlive-causets"
DESCRIPTION = "This package includes the documentation for texlive-causets"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn74247"

RPM_NAME = "texlive-causets-doc-2026.226.1.5svn74247-59.2.noarch.rpm"
RPM_HASH = "178918fccc29edad9f1664a0eed1a96004562a11f60f2a4e1c898bdd978e6a7e2ff798d488fd610952b0d3e7038f70b22ab22da5499448c0877d8a10a5cae71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-causets-doc"

RDEPENDS:${PN} += ""

inherit rpm
