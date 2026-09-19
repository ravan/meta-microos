SUMMARY = "Documentation for texlive-cbfonts-fd"
DESCRIPTION = "This package includes the documentation for texlive-cbfonts-fd"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn54080"

RPM_NAME = "texlive-cbfonts-fd-doc-2026.226.1.2svn54080-59.2.noarch.rpm"
RPM_HASH = "35ead09180026bf0561b0788254731b4d670a2841f957e92bd79b9358ea5a3855f2d9f3f53ef62006ab4ea760020632b3b1c6de7e24d794fdbd6de3430de8cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cbfonts-fd-doc"

RDEPENDS:${PN} += ""

inherit rpm
