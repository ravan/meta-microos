SUMMARY = "Documentation for texlive-xsavebox"
DESCRIPTION = "This package includes the documentation for texlive-xsavebox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.18svn77682"

RPM_NAME = "texlive-xsavebox-doc-2026.226.0.0.18svn77682-59.4.noarch.rpm"
RPM_HASH = "624ae727f8e10f0838b08b7abe86d2c0b7dc5beefeb26f293b40de075a1c5927c4780695807042e0ea8adddcfc35a2bbe7d144cdf8f92007a7bd89db946c34ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsavebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
