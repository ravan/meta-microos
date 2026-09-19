SUMMARY = "Documentation for texlive-fonts-churchslavonic"
DESCRIPTION = "This package includes the documentation for texlive-fonts-churchslavonic"
LICENSE = "OFL-1.1"

PV = "2026.226.2.3svn67473"

RPM_NAME = "texlive-fonts-churchslavonic-doc-2026.226.2.3svn67473-60.2.noarch.rpm"
RPM_HASH = "b760a31f67c3a94959e2fdf28debc33cd6124b9704f7cadea522f0e567810780682b8b99c21c96f97171cf4567e1336bf160f06b058242cf4b585defd3a78e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonts-churchslavonic-doc"

RDEPENDS:${PN} += ""

inherit rpm
