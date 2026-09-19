SUMMARY = "Documentation for texlive-rit-fonts"
DESCRIPTION = "This package includes the documentation for texlive-rit-fonts"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn74984"

RPM_NAME = "texlive-rit-fonts-doc-2026.226.1.0svn74984-60.4.noarch.rpm"
RPM_HASH = "eb3756dec2cda9e5d8c0838372d7311f197f00c2237a1bf115016761e72e8afd82567ac93c06c4cb280fb2c0ea63bcc1d1a0755decac44666c251695a98c9e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rit-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
