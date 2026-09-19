SUMMARY = "Documentation for texlive-dosepsbin"
DESCRIPTION = "This package includes the documentation for texlive-dosepsbin"
LICENSE = "Artistic-1.0"

PV = "2026.226.1.2svn29752"

RPM_NAME = "texlive-dosepsbin-doc-2026.226.1.2svn29752-59.2.noarch.rpm"
RPM_HASH = "aed0e1ff6c3a3b802d83a6e30e7ba944fec82e03bb54a1464283fdcdfa95e6bd25b4487975a35fb5bea6ae6ba9e7c5421f2d1a0674c0294c02d806ac3065aabe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dosepsbin.1 \
texlive-dosepsbin-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
