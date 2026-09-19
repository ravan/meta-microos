SUMMARY = "Documentation for texlive-bera"
DESCRIPTION = "This package includes the documentation for texlive-bera"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-bera-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "4b4f15e59bcff177329d728387d64f64af02b306f548fdfa5d89e250754a38503647553dfed3b1e02f688c4ddf92d8c112697057382b2da1a2dc6d01027ff9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bera-doc"

RDEPENDS:${PN} += ""

inherit rpm
