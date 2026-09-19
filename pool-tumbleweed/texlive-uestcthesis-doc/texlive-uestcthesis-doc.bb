SUMMARY = "Documentation for texlive-uestcthesis"
DESCRIPTION = "This package includes the documentation for texlive-uestcthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn36371"

RPM_NAME = "texlive-uestcthesis-doc-2026.226.1.1.0svn36371-60.2.noarch.rpm"
RPM_HASH = "32c43909562c6f49ba6d858989eb3d741b5021b1dfb4696c51ea790cd789384cbe95459f63cad430b93ff5f2a3ed22555eb1c6c33e7ea3938bc051d98862b6cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uestcthesis-doc-zh \
texlive-uestcthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
