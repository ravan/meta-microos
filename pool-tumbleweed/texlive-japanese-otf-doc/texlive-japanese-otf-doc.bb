SUMMARY = "Documentation for texlive-japanese-otf"
DESCRIPTION = "This package includes the documentation for texlive-japanese-otf"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-japanese-otf-doc-2026.226.svn77682-63.2.noarch.rpm"
RPM_HASH = "c903c0538d96e31117f47972e7b201206e4f11436b5daf23ecd1caedc25dc613a356472ded8806c43ac52fbb8e26fc9fe8116e79bc46ea8d3bc16478e247e30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-japanese-otf-doc-en;ja \
texlive-japanese-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
