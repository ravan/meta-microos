SUMMARY = "Documentation for texlive-subfigure"
DESCRIPTION = "This package includes the documentation for texlive-subfigure"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.5svn15878"

RPM_NAME = "texlive-subfigure-doc-2026.226.2.1.5svn15878-64.2.noarch.rpm"
RPM_HASH = "adf59f1a7361a17614372f16d9ec4cc12f79126a1e4542941dc86af445f0dbefffe67a491df21c645ff816725552a3097fbc7563b3dfc081c6c260fac46654a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
