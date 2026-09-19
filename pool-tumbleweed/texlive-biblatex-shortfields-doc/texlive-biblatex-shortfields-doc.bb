SUMMARY = "Documentation for texlive-biblatex-shortfields"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-shortfields"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn45858"

RPM_NAME = "texlive-biblatex-shortfields-doc-2026.226.1.0.1svn45858-61.2.noarch.rpm"
RPM_HASH = "de4ff45728bce8cffb8a28fa49008e71a77b5b30a3a0db1b8ef55669b6bc8186987e272860aebd2d4c08ba0fdf1984c8b0c1eeede5c1adb32a6d2534e279340c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-shortfields-doc"

RDEPENDS:${PN} += ""

inherit rpm
