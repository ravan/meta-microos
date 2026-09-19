SUMMARY = "Documentation for texlive-wargame"
DESCRIPTION = "This package includes the documentation for texlive-wargame"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn72903"

RPM_NAME = "texlive-wargame-doc-2026.226.0.0.8svn72903-60.2.noarch.rpm"
RPM_HASH = "5b275d85e5a8d02292e6355acf3df1773ee3b1c9ec80eef63860b7fa2f0c8d40f5e7f5c47010679a647f05c13e61b2111448ec521bb95b35510de0901fc2c6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wargame-doc"

RDEPENDS:${PN} += ""

inherit rpm
