SUMMARY = "Documentation for texlive-kdgdocs"
DESCRIPTION = "This package includes the documentation for texlive-kdgdocs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24498"

RPM_NAME = "texlive-kdgdocs-doc-2026.226.1.0svn24498-63.2.noarch.rpm"
RPM_HASH = "067c9bc8e8c696ad5144a4749b6760bcf89255c7ca60edbea17c5d46d848427166e4320c2275461d46d7baa7436b130fc9102ba76bdd9673736fde56cbda5d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kdgdocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
