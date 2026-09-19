SUMMARY = "Documentation for texlive-eiad-ltx"
DESCRIPTION = "This package includes the documentation for texlive-eiad-ltx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-doc-2026.226.1.0svn15878-61.4.noarch.rpm"
RPM_HASH = "a5718403aac73e61ef96bdd05e5903c7c50d61f2cabdafb7e1f006e0f785303a282f4661edffa523b47a7fc48108a3c9630660e133e2b1f61a2f25c654de6fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-ltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
