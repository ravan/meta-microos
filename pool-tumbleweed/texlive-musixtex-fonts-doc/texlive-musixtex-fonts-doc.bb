SUMMARY = "Documentation for texlive-musixtex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-musixtex-fonts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn65517"

RPM_NAME = "texlive-musixtex-fonts-doc-2026.226.svn65517-61.2.noarch.rpm"
RPM_HASH = "e6ab1335d33942e6e9f2f43a85aff865ab32eb513ca30df60635be7efe73c6e002bc1ec9f3429e421e24b2c5e916f7a2e0216a8f770b21fc79d1ffaf4a1f8899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musixtex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
