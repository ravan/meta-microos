SUMMARY = "Documentation for texlive-computational-complexity"
DESCRIPTION = "This package includes the documentation for texlive-computational-complexity"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.25fsvn44847"

RPM_NAME = "texlive-computational-complexity-doc-2026.226.2.25fsvn44847-60.2.noarch.rpm"
RPM_HASH = "6023c9a5204bac2ca533e70c4fc7dadd2f33078ac5beb6edf002227683e5358b4a52a155e58070a3d10dba6f9c6d56d0d19f906f7c15d4a20d501f9fbebeb2de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-computational-complexity-doc"

RDEPENDS:${PN} += ""

inherit rpm
