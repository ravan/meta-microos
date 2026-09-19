SUMMARY = "Documentation for texlive-clistmap"
DESCRIPTION = "This package includes the documentation for texlive-clistmap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-clistmap-doc-2026.226.1.2svn76924-60.2.noarch.rpm"
RPM_HASH = "d05fe84718e0d010c1d62ab50fa8d851fb80d2e445eb9e058308082991fd7b705dc47c7e23f058c07edc9665d4cd0d014e4e8aadb07478615cce22a6c47a352d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clistmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
