SUMMARY = "Documentation for texlive-xetex"
DESCRIPTION = "This package includes the documentation for texlive-xetex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-xetex-doc-2026.226.svn77830-59.4.noarch.rpm"
RPM_HASH = "a029d10b74bcb64bb2d56c667a3a831b80ee1c0b9188eb6613ed4f6f14ad300cc7f560f8beb5c51e1d190073fb2857d934cb1d668da10c6c643926f3e83fd0ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xelatex-unsafe.1 \
man-xelatex.1 \
man-xetex-unsafe.1 \
man-xetex.1 \
texlive-xetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
