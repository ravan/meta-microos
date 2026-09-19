SUMMARY = "Documentation for texlive-epigraph-keys"
DESCRIPTION = "This package includes the documentation for texlive-epigraph-keys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75301"

RPM_NAME = "texlive-epigraph-keys-doc-2026.226.1.0svn75301-61.4.noarch.rpm"
RPM_HASH = "1721a3674da8194d955f31aa555bbfc3cbf96ccc1e3c819dcadf89408c82112c314f66e51da8e0f580fbe7ce5a00ef91765a0e719fee12a9015ef2df09eb281d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-keys-doc"

RDEPENDS:${PN} += ""

inherit rpm
