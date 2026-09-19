SUMMARY = "Documentation for texlive-relenc"
DESCRIPTION = "This package includes the documentation for texlive-relenc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn22050"

RPM_NAME = "texlive-relenc-doc-2026.226.svn22050-60.4.noarch.rpm"
RPM_HASH = "a6e85be555a821598695e0b10b3f07df925c1fb38abe0b1f4477db11679a9dfc0e73316db4800e66df25f0f958c5a603ebc47a94adff91653c5d8c5155aabe64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
