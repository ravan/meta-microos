SUMMARY = "Documentation for texlive-bangtex"
DESCRIPTION = "This package includes the documentation for texlive-bangtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55475"

RPM_NAME = "texlive-bangtex-doc-2026.226.svn55475-60.2.noarch.rpm"
RPM_HASH = "7b0a031b8f364c4966094f7616a95f878ae6346dfb0f2ebac9414160e9bf05522900144442b2d1b0beb0815c59409e38bf684337d09fbb2b3236c37ab705957f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
