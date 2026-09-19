SUMMARY = "Documentation for texlive-velthuis"
DESCRIPTION = "This package includes the documentation for texlive-velthuis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.17.1svn66186"

RPM_NAME = "texlive-velthuis-doc-2026.226.2.17.1svn66186-60.2.noarch.rpm"
RPM_HASH = "e81d989e52837d6b990042817d63a77ec205ba841c03afde6c8519529bf4083e7a2ffff3095aa06e61d09d4a87ea3bf375852662cee06334f16626e1e4ba0343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-devnag.1 \
texlive-velthuis-doc"

RDEPENDS:${PN} += ""

inherit rpm
