SUMMARY = "Documentation for texlive-yathesis"
DESCRIPTION = "This package includes the documentation for texlive-yathesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.12svn70511"

RPM_NAME = "texlive-yathesis-doc-2026.226.1.0.12svn70511-59.4.noarch.rpm"
RPM_HASH = "de733f375615855dd13d77ccadd29202c38adb4aa2897c988381fc1af4dab4d5198f31f60672e0b99ace7437e12aba8b27ad3fbf34e89db949f3b72f533daa4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yathesis-doc-fr \
texlive-yathesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
