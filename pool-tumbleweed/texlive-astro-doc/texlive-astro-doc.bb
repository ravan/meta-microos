SUMMARY = "Documentation for texlive-astro"
DESCRIPTION = "This package includes the documentation for texlive-astro"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.20svn15878"

RPM_NAME = "texlive-astro-doc-2026.226.2.20svn15878-60.2.noarch.rpm"
RPM_HASH = "185db3a543e7441310b9666395ac5c9abea4b5b0b8f45c010cea84ea38bb2a5480d0f4ee524b18755340f73a9aca2154b2ed25e38dc88283ce1a67d239a2f18e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-astro-doc"

RDEPENDS:${PN} += ""

inherit rpm
