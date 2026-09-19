SUMMARY = "Documentation for texlive-ptex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fonts"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn64330"

RPM_NAME = "texlive-ptex-fonts-doc-2026.226.svn64330-60.4.noarch.rpm"
RPM_HASH = "e669a114fd2a808454aa349519c8b69f885d4d43fbbda495bed5699ac1a9c99f7b46867d724355666be99efb3924517edd28ffd98324c58cad2fa42ab707cd23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
