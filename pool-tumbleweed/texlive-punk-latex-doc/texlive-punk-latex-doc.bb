SUMMARY = "Documentation for texlive-punk-latex"
DESCRIPTION = "This package includes the documentation for texlive-punk-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn27389"

RPM_NAME = "texlive-punk-latex-doc-2026.226.1.1svn27389-60.4.noarch.rpm"
RPM_HASH = "a89ad8c0aceef5b56039125ccfe6d37b45f49e3b9c02b4873e28075a5b6135f7b9027efb0a22905a4080d449f951b6b980aa4fea207c0a8abab86792620a5e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
