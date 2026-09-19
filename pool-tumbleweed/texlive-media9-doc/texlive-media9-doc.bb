SUMMARY = "Documentation for texlive-media9"
DESCRIPTION = "This package includes the documentation for texlive-media9"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.30svn76924"

RPM_NAME = "texlive-media9-doc-2026.226.1.30svn76924-59.2.noarch.rpm"
RPM_HASH = "39eea6c29b9936799312264e6a0ab1a420888754df836cd7f7e8dc9eb3bb8d7aa2f1a0eb9be1ffcfff6fc8d3f4faad1b77fd5a3b5d12a3afddac026420c50178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-media9-doc"

RDEPENDS:${PN} += ""

inherit rpm
