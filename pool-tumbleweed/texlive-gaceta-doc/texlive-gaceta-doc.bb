SUMMARY = "Documentation for texlive-gaceta"
DESCRIPTION = "This package includes the documentation for texlive-gaceta"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06svn15878"

RPM_NAME = "texlive-gaceta-doc-2026.226.1.06svn15878-60.2.noarch.rpm"
RPM_HASH = "02bae80204cb880ba102974a5593f91989812c608b9920e641cf10c3b8bc033d8409e2f58abef0c584bc335e4959a1c44a9083ad906a41450b63f04ab49c371f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gaceta-doc-es \
texlive-gaceta-doc"

RDEPENDS:${PN} += ""

inherit rpm
