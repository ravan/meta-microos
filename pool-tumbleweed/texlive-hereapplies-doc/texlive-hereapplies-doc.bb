SUMMARY = "Documentation for texlive-hereapplies"
DESCRIPTION = "This package includes the documentation for texlive-hereapplies"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.2svn68638"

RPM_NAME = "texlive-hereapplies-doc-2026.226.1.0.2svn68638-60.4.noarch.rpm"
RPM_HASH = "aa2c1f272c1fed754957d198c7d0c0938b2f8bcb2d38b445a928ab983d10c0601bf459cb3e21f1fd03c884041b6e8f086bbbdb1b4a785b3280bcc9e7ae2cbe58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hereapplies-doc"

RDEPENDS:${PN} += ""

inherit rpm
