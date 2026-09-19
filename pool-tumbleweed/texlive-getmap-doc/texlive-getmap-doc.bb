SUMMARY = "Documentation for texlive-getmap"
DESCRIPTION = "This package includes the documentation for texlive-getmap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11svn75447"

RPM_NAME = "texlive-getmap-doc-2026.226.1.11svn75447-60.2.noarch.rpm"
RPM_HASH = "c3c76cc8f64d76715466b01fcb42c62c671e4e7a70b0c66b3e99042c2dc1fd66e1863d504990eb757dc6a62b5ab41bec435eb366ea7f998139b48816a8fbd6ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
