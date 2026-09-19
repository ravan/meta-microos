SUMMARY = "Documentation for texlive-alegreya"
DESCRIPTION = "This package includes the documentation for texlive-alegreya"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-alegreya-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "6d67893e3adc9c3b0c7833899f7542db43c935645d80a5d3b2d6e731001cde312482515d7e119374de095a9e088a17258d25b13e94678796edb31a1eecaa8b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alegreya-doc"

RDEPENDS:${PN} += ""

inherit rpm
