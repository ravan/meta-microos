SUMMARY = "Documentation for texlive-multiexpand"
DESCRIPTION = "This package includes the documentation for texlive-multiexpand"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-multiexpand-doc-2026.226.1.5svn77682-61.2.noarch.rpm"
RPM_HASH = "f4e6a5f1c40e6358ebe63dd0306f8b248c9bf30e4bdd2a0d22371e76a14b6f54d1a23db96c60fb1bdf5f8330f9b846627ce93f7313b1570086463bb30d2eb14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiexpand-doc"

RDEPENDS:${PN} += ""

inherit rpm
