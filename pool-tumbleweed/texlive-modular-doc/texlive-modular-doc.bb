SUMMARY = "Documentation for texlive-modular"
DESCRIPTION = "This package includes the documentation for texlive-modular"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44142"

RPM_NAME = "texlive-modular-doc-2026.226.svn44142-61.2.noarch.rpm"
RPM_HASH = "3fc796a23927c7e939a98e5de6c50d03a72472aec5f2217677e4afadb0cdbc6a3126d3d76557b0992bc220a868f3e5a36c3f17fb3b7d3d2d742d2d9728c06145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modular-doc"

RDEPENDS:${PN} += ""

inherit rpm
