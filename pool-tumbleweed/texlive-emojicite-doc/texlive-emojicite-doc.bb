SUMMARY = "Documentation for texlive-emojicite"
DESCRIPTION = "This package includes the documentation for texlive-emojicite"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn76924"

RPM_NAME = "texlive-emojicite-doc-2026.226.0.0.3svn76924-61.4.noarch.rpm"
RPM_HASH = "05a8bfd37d23c32ac8c6ac4dbc453a2cb730422d748ba37fc138e8e24c0dbe77c92373fa680de73b6d3803aec48b81b2dc10c2bc3e9b8cc9d76c588c2b09433b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emojicite-doc"

RDEPENDS:${PN} += ""

inherit rpm
