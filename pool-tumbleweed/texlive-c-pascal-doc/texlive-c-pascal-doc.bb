SUMMARY = "Documentation for texlive-c-pascal"
DESCRIPTION = "This package includes the documentation for texlive-c-pascal"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn18337"

RPM_NAME = "texlive-c-pascal-doc-2026.226.1.2svn18337-59.2.noarch.rpm"
RPM_HASH = "ca06fe7459b9c61d7652978822a6c105ffb92b5ef3cf321e7bb7ec050b367aef5ba558cede39cb0f86faa7ddc896ee91b698925ec633cf17e5b872c917ddff49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-c-pascal-doc-en;pl \
texlive-c-pascal-doc"

RDEPENDS:${PN} += ""

inherit rpm
