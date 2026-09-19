SUMMARY = "Documentation for texlive-thuaslogos"
DESCRIPTION = "This package includes the documentation for texlive-thuaslogos"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2svn51347"

RPM_NAME = "texlive-thuaslogos-doc-2026.227.1.2svn51347-62.2.noarch.rpm"
RPM_HASH = "6df66dbaa8da9f62ba66fdd20c021454a8e1c05bfc54282e4f662b9d873a032367564633ff72d20e3322f883ddc27d79e8f58a8d9b9acba119a2fb8ea3bdaee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thuaslogos-doc-nl \
texlive-thuaslogos-doc"

RDEPENDS:${PN} += ""

inherit rpm
