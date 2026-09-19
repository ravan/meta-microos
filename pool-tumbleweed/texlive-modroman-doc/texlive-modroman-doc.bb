SUMMARY = "Documentation for texlive-modroman"
DESCRIPTION = "This package includes the documentation for texlive-modroman"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn76924"

RPM_NAME = "texlive-modroman-doc-2026.226.1svn76924-61.2.noarch.rpm"
RPM_HASH = "1044301d85c7343151301f834867511121b80650655aad15c452389350cf5ef2e7b6b1dec54d08db21e82406444aad8c45a2bbde0e90640e3e229749adf095e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-modroman-doc-en;fr \
texlive-modroman-doc"

RDEPENDS:${PN} += ""

inherit rpm
