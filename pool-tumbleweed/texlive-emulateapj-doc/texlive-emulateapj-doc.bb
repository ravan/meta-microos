SUMMARY = "Documentation for texlive-emulateapj"
DESCRIPTION = "This package includes the documentation for texlive-emulateapj"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74166"

RPM_NAME = "texlive-emulateapj-doc-2026.226.svn74166-61.4.noarch.rpm"
RPM_HASH = "71804539abd468f9b7244ca5b405737dc3cee1a5950a93e1f75957b8d772fd65f7971a315bf0f165bdd07314d1748460664b84474e41c50cdf740fd77fea23a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emulateapj-doc"

RDEPENDS:${PN} += ""

inherit rpm
