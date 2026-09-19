SUMMARY = "Documentation for texlive-coloring"
DESCRIPTION = "This package includes the documentation for texlive-coloring"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn41042"

RPM_NAME = "texlive-coloring-doc-2026.226.0.0.2svn41042-60.2.noarch.rpm"
RPM_HASH = "92a524eab3ce51526c44ab6b01978202b5a663b0ef09af1923fdf1db021c69f75fe944cf3bb724686f93eae7808d149d884d327a87a716ca492d30ec03bab0ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coloring-doc"

RDEPENDS:${PN} += ""

inherit rpm
