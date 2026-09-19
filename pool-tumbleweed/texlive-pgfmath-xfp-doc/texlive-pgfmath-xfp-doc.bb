SUMMARY = "Documentation for texlive-pgfmath-xfp"
DESCRIPTION = "This package includes the documentation for texlive-pgfmath-xfp"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn76924"

RPM_NAME = "texlive-pgfmath-xfp-doc-2026.226.1.0asvn76924-58.2.noarch.rpm"
RPM_HASH = "574b6f0e355dfdfc3805a4959af1ba50dd9b5ee608e581854be4a44fc6806f96b83a998151ddd1f84271a2ca23f3cbee3dfd36a19475bf6b2e8c03e14dc6d2a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfmath-xfp-doc"

RDEPENDS:${PN} += ""

inherit rpm
