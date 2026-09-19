SUMMARY = "Documentation for texlive-objectz"
DESCRIPTION = "This package includes the documentation for texlive-objectz"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn61719"

RPM_NAME = "texlive-objectz-doc-2026.226.svn61719-61.2.noarch.rpm"
RPM_HASH = "4dd9396e2b37ea7f3740c5c9da9fc09ea85b186399b573747df55d7276f5c5a4a96eb15f31ba37fb3706b98e9d9abffc06eb8c7f851663b2094f897539b174b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-objectz-doc"

RDEPENDS:${PN} += ""

inherit rpm
