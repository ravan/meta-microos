SUMMARY = "Documentation for texlive-rtklage"
DESCRIPTION = "This package includes the documentation for texlive-rtklage"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-rtklage-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "bbaf8df6bc8fff5e35188cc37d37c2cce0e4726f2bbcbbef61c41896a3df883af7aa27d61bded3a7037e286eff070e636141b723299ef15a337a6e74dac60e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-rtklage-doc-de \
texlive-rtklage-doc"

RDEPENDS:${PN} += ""

inherit rpm
