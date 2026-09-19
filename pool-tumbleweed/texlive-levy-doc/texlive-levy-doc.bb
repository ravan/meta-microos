SUMMARY = "Documentation for texlive-levy"
DESCRIPTION = "This package includes the documentation for texlive-levy"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-levy-doc-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "2228999e793a9c147634e50b6ba48f647c5ff91b327df082950af65b8537f8583ab5d8e0beb6be8fd8eaee9d0ce0ebc2ca3e40fb7629bab44e826d98ba833411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-levy-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
