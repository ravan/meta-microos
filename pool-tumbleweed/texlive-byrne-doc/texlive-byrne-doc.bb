SUMMARY = "Documentation for texlive-byrne"
DESCRIPTION = "This package includes the documentation for texlive-byrne"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.5svn77031"

RPM_NAME = "texlive-byrne-doc-2026.226.0.0.2.5svn77031-59.2.noarch.rpm"
RPM_HASH = "fb71bda57fda9e0bc308d1b15c437eded5bcab523c2188c1562a8d3737ee0de93d494ad0b352b30273e85c5966e1df91deab44dee49fd6642d3c4869492e3895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-byrne-doc"

RDEPENDS:${PN} += ""

inherit rpm
