SUMMARY = "Documentation for texlive-thesis-ekf"
DESCRIPTION = "This package includes the documentation for texlive-thesis-ekf"
LICENSE = "LPPL-1.0"

PV = "2026.227.5.0svn77332"

RPM_NAME = "texlive-thesis-ekf-doc-2026.227.5.0svn77332-62.2.noarch.rpm"
RPM_HASH = "8333f2bfca5fd8f3af0d205752c96307a82c627685ea7bfc3fe66be1d595dfca4b27994d80f00b2c129a608f0e402f144f87b7d58895027658ef10963b0ad9fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thesis-ekf-doc-hu \
texlive-thesis-ekf-doc"

RDEPENDS:${PN} += ""

inherit rpm
