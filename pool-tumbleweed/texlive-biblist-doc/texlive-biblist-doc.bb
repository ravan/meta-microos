SUMMARY = "Documentation for texlive-biblist"
DESCRIPTION = "This package includes the documentation for texlive-biblist"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-biblist-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "ed446412c54ae3ad8a6a5396f2b56009889056b31adbfef6e86015998c7e86786f1d3d35ae58e218246fa6cdb178cbd41329d4facc65412f6e3b6c5019146111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblist-doc"

RDEPENDS:${PN} += ""

inherit rpm
