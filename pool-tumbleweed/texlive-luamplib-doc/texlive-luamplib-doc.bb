SUMMARY = "Documentation for texlive-luamplib"
DESCRIPTION = "This package includes the documentation for texlive-luamplib"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.39.0svn77696"

RPM_NAME = "texlive-luamplib-doc-2026.226.2.39.0svn77696-59.2.noarch.rpm"
RPM_HASH = "28030bcd5d3a5c64dc39497a062ab98c82930722013a544e615dc233c0218244605750394ad0ce0baab8d6467130372156d74ef51a4fa633f8cc245b55c5aad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamplib-doc"

RDEPENDS:${PN} += ""

inherit rpm
