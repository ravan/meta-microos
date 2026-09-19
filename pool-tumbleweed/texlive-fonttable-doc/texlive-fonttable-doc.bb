SUMMARY = "Documentation for texlive-fonttable"
DESCRIPTION = "This package includes the documentation for texlive-fonttable"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6dsvn77682"

RPM_NAME = "texlive-fonttable-doc-2026.226.1.6dsvn77682-60.2.noarch.rpm"
RPM_HASH = "a971a3aac0e1ed6d5b4143eee151beb3d7e1a17ff8256046bc168bbd2a1bf3226f01bb9433758d9ab7c8cab424c04e274f330673505af4501387d2c43b7c3c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonttable-doc"

RDEPENDS:${PN} += ""

inherit rpm
