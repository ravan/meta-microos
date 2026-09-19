SUMMARY = "Documentation for texlive-enigma"
DESCRIPTION = "This package includes the documentation for texlive-enigma"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.1svn29802"

RPM_NAME = "texlive-enigma-doc-2026.226.0.0.1svn29802-61.4.noarch.rpm"
RPM_HASH = "94a91c4c2e15920de095e3bd206ec593318c09bd4ff54a82216337cf9d36fc99b35a7bcccdc3a99739f1ab971de3aca15dc786f9865cd4ae64eaf26c20d079b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enigma-doc"

RDEPENDS:${PN} += ""

inherit rpm
