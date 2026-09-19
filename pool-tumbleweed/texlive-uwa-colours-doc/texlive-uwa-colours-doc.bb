SUMMARY = "Documentation for texlive-uwa-colours"
DESCRIPTION = "This package includes the documentation for texlive-uwa-colours"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn60443"

RPM_NAME = "texlive-uwa-colours-doc-2026.226.1.0.0svn60443-60.2.noarch.rpm"
RPM_HASH = "a94f27268c39e58d5e2ef0fbd0892da8bae51d2be274b1de12973783d53c49bc8721c9394d038db2e4cc5f2a39d7be0566dd9ab50c4592eea2ef5c404c48bd3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-colours-doc"

RDEPENDS:${PN} += ""

inherit rpm
