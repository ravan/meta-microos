SUMMARY = "Documentation for texlive-rescansync"
DESCRIPTION = "This package includes the documentation for texlive-rescansync"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.0svn76924"

RPM_NAME = "texlive-rescansync-doc-2026.226.0.0.0.0svn76924-60.4.noarch.rpm"
RPM_HASH = "6f738e16434ea9245fee40ea484dc8d76ad71fb065e1aa038b3aae05d5bd4632261ae3493925d270828e60277b33faf4921e31d23003fd4c7283263c9f2234d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rescansync-doc"

RDEPENDS:${PN} += ""

inherit rpm
