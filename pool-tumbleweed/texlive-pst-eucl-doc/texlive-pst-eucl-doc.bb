SUMMARY = "Documentation for texlive-pst-eucl"
DESCRIPTION = "This package includes the documentation for texlive-pst-eucl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.77svn77682"

RPM_NAME = "texlive-pst-eucl-doc-2026.226.1.77svn77682-59.2.noarch.rpm"
RPM_HASH = "7d996283a240c3c8ebce9eaad2d380a2d7b0724bfff19369d5acedb4e7e7ab38c1af21d27766f9066d030d39fa93f46635b719ecc203d0ab22910105a0a76b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-eucl-doc-en \
texlive-pst-eucl-doc"

RDEPENDS:${PN} += ""

inherit rpm
