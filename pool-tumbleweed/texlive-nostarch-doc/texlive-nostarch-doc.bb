SUMMARY = "Documentation for texlive-nostarch"
DESCRIPTION = "This package includes the documentation for texlive-nostarch"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn67683"

RPM_NAME = "texlive-nostarch-doc-2026.226.2.4svn67683-61.2.noarch.rpm"
RPM_HASH = "046ac52d86327fce2da8c3a42609e0b8e3146f7de3e76c8e507d563c6690d715549658d80b3b5de7d8f96558e92ddea72d38f239dc34a4a4feb4f90b99ffa350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nostarch-doc"

RDEPENDS:${PN} += ""

inherit rpm
