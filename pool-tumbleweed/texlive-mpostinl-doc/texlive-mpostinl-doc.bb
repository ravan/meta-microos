SUMMARY = "Documentation for texlive-mpostinl"
DESCRIPTION = "This package includes the documentation for texlive-mpostinl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.3svn77187"

RPM_NAME = "texlive-mpostinl-doc-2026.226.1.5.3svn77187-61.2.noarch.rpm"
RPM_HASH = "4d6e9d9b1e6278611b841e69eb91e09b83e9f7cd9970bfb73be2290c679f97d6118cc293ed34bc64974650c328a915cd1149684669f6530a74d6031b391b973c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpostinl-doc"

RDEPENDS:${PN} += ""

inherit rpm
