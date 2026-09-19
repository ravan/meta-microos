SUMMARY = "Documentation for texlive-tangocolors"
DESCRIPTION = "This package includes the documentation for texlive-tangocolors"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.3svn66733"

RPM_NAME = "texlive-tangocolors-doc-2026.227.0.0.3svn66733-62.2.noarch.rpm"
RPM_HASH = "00f9100ff785f773190314f2e61453e939f73b9ae84c9ef45b4536287e7d6e0f6af8d839c240f5deff1881761da0a20545604812ff34221a8503e0f4b3a31a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tangocolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
