SUMMARY = "Documentation for texlive-hfoldsty"
DESCRIPTION = "This package includes the documentation for texlive-hfoldsty"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.15svn29349"

RPM_NAME = "texlive-hfoldsty-doc-2026.226.1.15svn29349-60.4.noarch.rpm"
RPM_HASH = "8bc02787ee8335ef9c3fa823f93f3903eae2a3c93aa485bb8d4de68f576d02fa3a40b7ba6a2f5c00c2512e201a22ef63f2a49396a8345abdd305b29ebb8f10aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfoldsty-doc"

RDEPENDS:${PN} += ""

inherit rpm
