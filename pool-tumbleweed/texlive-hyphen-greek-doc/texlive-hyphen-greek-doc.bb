SUMMARY = "Documentation for texlive-hyphen-greek"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-greek"
LICENSE = "LPPL-1.0"

PV = "2026.226.5svn78069"

RPM_NAME = "texlive-hyphen-greek-doc-2026.226.5svn78069-60.2.noarch.rpm"
RPM_HASH = "735fad1c70e3f16825f547947e73be92374959207cdeeedd78384f2c2659846031732773c6d295c2d1ea2fdab94d31acb68f8f9f0eea0711ce8ee371b8ae8dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-greek-doc"

RDEPENDS:${PN} += ""

inherit rpm
