SUMMARY = "Documentation for texlive-hyplain"
DESCRIPTION = "This package includes the documentation for texlive-hyplain"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-hyplain-doc-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "6c44ab67ab2ea4c7d5899919e8a3468f9ec603de53337787d5f73e56acbfd668d4621b46a8f2467420feadcb83066a883764e7584fc10d3652552803ec3ca31e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyplain-doc"

RDEPENDS:${PN} += ""

inherit rpm
