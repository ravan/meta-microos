SUMMARY = "Documentation for texlive-tui"
DESCRIPTION = "This package includes the documentation for texlive-tui"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn27253"

RPM_NAME = "texlive-tui-doc-2026.226.1.9svn27253-59.2.noarch.rpm"
RPM_HASH = "edd6a333a1f90e14161002e31e3277f590214bc5fcb5554ad1023717af628d052f20c24cfc04e51e02aa28e900647f5195259bf2a14272efbd676981622acecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tui-doc-en;es \
texlive-tui-doc"

RDEPENDS:${PN} += ""

inherit rpm
