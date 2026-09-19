SUMMARY = "Documentation for texlive-pst-labo"
DESCRIPTION = "This package includes the documentation for texlive-pst-labo"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.07svn74874"

RPM_NAME = "texlive-pst-labo-doc-2026.226.2.07svn74874-59.2.noarch.rpm"
RPM_HASH = "63c115f0e3de0acb94d21fa1c123dfc9efb6dc9a3aef08672c0014bf84c9a3ae4ccfed1bf9e50df07f38d47472cebb2c6cceb01b7571da9858ddff44841f3495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-labo-doc"

RDEPENDS:${PN} += ""

inherit rpm
