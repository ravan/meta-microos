SUMMARY = "Documentation for texlive-newvbtm"
DESCRIPTION = "This package includes the documentation for texlive-newvbtm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn23996"

RPM_NAME = "texlive-newvbtm-doc-2026.226.1.1svn23996-61.2.noarch.rpm"
RPM_HASH = "76340b2c405c06ff77a84806168e1ff28fb3066e0ed26e38ed9b1ef4090368b0eeb87d27d8dd9b48cb6d9e8bba3fefddf96e605d2c0d6b9735e65ec4eabd5736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newvbtm-doc"

RDEPENDS:${PN} += ""

inherit rpm
