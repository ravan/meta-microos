SUMMARY = "Documentation for texlive-simplewick"
DESCRIPTION = "This package includes the documentation for texlive-simplewick"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2asvn15878"

RPM_NAME = "texlive-simplewick-doc-2026.226.1.2asvn15878-60.2.noarch.rpm"
RPM_HASH = "8e905ab85999e5ae23aced6435e241d9e44f2d89da660e41b938a8dc761bf6fbe85a984139110fd75ce566470fdb38f5c4e7edee3f0eebeb171fe013c10344d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplewick-doc"

RDEPENDS:${PN} += ""

inherit rpm
