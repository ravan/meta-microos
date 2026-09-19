SUMMARY = "Documentation for texlive-juliamono"
DESCRIPTION = "This package includes the documentation for texlive-juliamono"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.06svn77682"

RPM_NAME = "texlive-juliamono-doc-2026.226.0.0.06svn77682-63.2.noarch.rpm"
RPM_HASH = "c9d37f753ae0044836341377d63054b80bbe9240aed5a0f18de0cb9bffd38898cad73d553a53630bf98a67ab98c82ea1cf841994aaf5f1a436048a9934e1e926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-juliamono-doc"

RDEPENDS:${PN} += ""

inherit rpm
