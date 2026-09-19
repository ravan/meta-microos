SUMMARY = "Documentation for texlive-complexity"
DESCRIPTION = "This package includes the documentation for texlive-complexity"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.81asvn45322"

RPM_NAME = "texlive-complexity-doc-2026.226.0.0.81asvn45322-60.2.noarch.rpm"
RPM_HASH = "b0ed8cf65fd38d0110c58f654e27978a722dc002ddbd60d8c40d743df9039f1fd4a390b49ccf59f9a05e0b9df3ba51dcdb7aeb44bc63128019031e964cbc8feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-complexity-doc"

RDEPENDS:${PN} += ""

inherit rpm
