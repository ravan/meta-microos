SUMMARY = "Documentation for texlive-tram"
DESCRIPTION = "This package includes the documentation for texlive-tram"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn29803"

RPM_NAME = "texlive-tram-doc-2026.226.0.0.2svn29803-59.2.noarch.rpm"
RPM_HASH = "a991238605f1ab768f383ede0b9f769d76f2fb011ca36cf4969cd3cdbe30e647f4eba164b260752b5eb0447ad8223554773ffc3502173ba4720c725bb7caa5a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tram-doc"

RDEPENDS:${PN} += ""

inherit rpm
