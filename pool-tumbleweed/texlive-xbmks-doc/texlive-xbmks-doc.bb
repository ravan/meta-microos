SUMMARY = "Documentation for texlive-xbmks"
DESCRIPTION = "This package includes the documentation for texlive-xbmks"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn53448"

RPM_NAME = "texlive-xbmks-doc-2026.226.svn53448-59.4.noarch.rpm"
RPM_HASH = "772463084c748f38e8a8e1748e78ad81b3c383faa15588a98b7ff380f88361c3712f8a4d6d4877e875f254afc753f281df02f83575214b8952493258d392110f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xbmks-doc"

RDEPENDS:${PN} += ""

inherit rpm
