SUMMARY = "Documentation for texlive-regexpatch"
DESCRIPTION = "This package includes the documentation for texlive-regexpatch"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2fsvn77682"

RPM_NAME = "texlive-regexpatch-doc-2026.226.0.0.2fsvn77682-60.4.noarch.rpm"
RPM_HASH = "b512dcc32d5385962f041a17b9c7052d127119c41a87290c2ac7c9c59ec7562a3e4223b756777bd06dbd250683c71de4f28d6fb8929e7a83c447319186adbd44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regexpatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
