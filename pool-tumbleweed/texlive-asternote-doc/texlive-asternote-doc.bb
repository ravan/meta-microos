SUMMARY = "Documentation for texlive-asternote"
DESCRIPTION = "This package includes the documentation for texlive-asternote"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn63838"

RPM_NAME = "texlive-asternote-doc-2026.226.1.1svn63838-60.2.noarch.rpm"
RPM_HASH = "885a272c42791142cf42685a3ed1ccf6bd7799111ab16ebfba684a2fa98380b557c9336a688c4cdc3fab1a5ed36fdc589d3819421319a3ae35cf370cf7a14989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-asternote-doc-en \
texlive-asternote-doc"

RDEPENDS:${PN} += ""

inherit rpm
