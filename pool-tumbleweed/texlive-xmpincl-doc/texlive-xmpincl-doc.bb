SUMMARY = "Documentation for texlive-xmpincl"
DESCRIPTION = "This package includes the documentation for texlive-xmpincl"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.4svn60593"

RPM_NAME = "texlive-xmpincl-doc-2026.226.2.4svn60593-59.4.noarch.rpm"
RPM_HASH = "1d9c82f7d4a21b427983b0ae57a2db1342a36e281834c50946df299ac1af2cc1ecd55d7460da9283d264936456ae71040001de39e931711ab5e54ea6ec2d648f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmpincl-doc"

RDEPENDS:${PN} += ""

inherit rpm
