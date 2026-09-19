SUMMARY = "Documentation for texlive-bjfuthesis"
DESCRIPTION = "This package includes the documentation for texlive-bjfuthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2.1svn59809"

RPM_NAME = "texlive-bjfuthesis-doc-2026.226.1.2.1svn59809-59.2.noarch.rpm"
RPM_HASH = "c00ac58353d37cb71bd967dbdbf19e55ea361d7c09907b6b1f34a6b5bec0d9b0379a6b401df0eeea23f78194315e453d73d438952cfb02187d1e9518b8ed7f49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-bjfuthesis-doc-zh \
texlive-bjfuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
