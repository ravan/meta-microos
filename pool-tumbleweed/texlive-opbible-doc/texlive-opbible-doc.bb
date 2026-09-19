SUMMARY = "Documentation for texlive-opbible"
DESCRIPTION = "This package includes the documentation for texlive-opbible"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.31svn77161"

RPM_NAME = "texlive-opbible-doc-2026.226.0.0.31svn77161-61.2.noarch.rpm"
RPM_HASH = "c1777a3c98f08fa58c2dba655963ed0d2d104fcc33356235d068c848bfe0588ec60cbe45782bd9c7a3683e2689b4ffbf02503e65d5362a2d120dff36038ea419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opbible-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13"

inherit rpm
