SUMMARY = "Documentation for texlive-babel-welsh"
DESCRIPTION = "This package includes the documentation for texlive-babel-welsh"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1csvn77682"

RPM_NAME = "texlive-babel-welsh-doc-2026.226.1.1csvn77682-60.2.noarch.rpm"
RPM_HASH = "eb269c76ca27922ae12207aed0a91ec5f83a36b7dcf1a3103312b739752977ee9f580f1cf951e3657f9dc24f669613a26fe32c942d2be97a447e33bb42fa98cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-welsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
