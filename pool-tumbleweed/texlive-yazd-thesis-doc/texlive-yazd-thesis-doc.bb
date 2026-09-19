SUMMARY = "Documentation for texlive-yazd-thesis"
DESCRIPTION = "This package includes the documentation for texlive-yazd-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-doc-2026.226.0.0.3svn61719-59.4.noarch.rpm"
RPM_HASH = "28957a3409e751130a97d5343ffb5e836e3b1e6897150439fca9e957163edc367489f818e7a5622f9639d13c02e3b338de463b3d566c48f2caa1c3c09f6344a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yazd-thesis-doc-fa \
texlive-yazd-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
