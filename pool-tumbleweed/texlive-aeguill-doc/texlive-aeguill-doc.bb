SUMMARY = "Documentation for texlive-aeguill"
DESCRIPTION = "This package includes the documentation for texlive-aeguill"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-aeguill-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "55d5cd9bb1dc8faafab22a3a3f120304a15dadd49fa2037afc3dad2ff6bcce38898cc85d5d33f5432286bdb895db1683c322236f4af0509747e1e7bb2441e6b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aeguill-doc"

RDEPENDS:${PN} += ""

inherit rpm
