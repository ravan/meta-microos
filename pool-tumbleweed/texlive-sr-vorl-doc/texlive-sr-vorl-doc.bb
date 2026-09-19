SUMMARY = "Documentation for texlive-sr-vorl"
DESCRIPTION = "This package includes the documentation for texlive-sr-vorl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn59333"

RPM_NAME = "texlive-sr-vorl-doc-2026.226.1.2svn59333-64.2.noarch.rpm"
RPM_HASH = "47bd88373fd810a631061951674790fffe9da1cfc07d4456a7173a176c3dbb758d899981a6e0cb1b2641c0ce84a909e47a376d012474f5709f44f32e8a8132c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sr-vorl-doc"

RDEPENDS:${PN} += ""

inherit rpm
