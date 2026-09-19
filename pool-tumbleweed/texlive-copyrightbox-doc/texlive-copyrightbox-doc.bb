SUMMARY = "Documentation for texlive-copyrightbox"
DESCRIPTION = "This package includes the documentation for texlive-copyrightbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn24829"

RPM_NAME = "texlive-copyrightbox-doc-2026.226.0.0.1svn24829-61.2.noarch.rpm"
RPM_HASH = "3c764cea9a20061c2d2855ab2ffdc04d3c91c43c6698a167f729acb42a962d7123e34b0a422358254b47883fe4182d103c32e394e7c30a8bd2ae485d27726a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-copyrightbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
