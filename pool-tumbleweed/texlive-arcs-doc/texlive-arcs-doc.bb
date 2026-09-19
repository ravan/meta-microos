SUMMARY = "Documentation for texlive-arcs"
DESCRIPTION = "This package includes the documentation for texlive-arcs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn15878"

RPM_NAME = "texlive-arcs-doc-2026.226.1svn15878-61.2.noarch.rpm"
RPM_HASH = "4a776f48e5677cdbc0c4bbebb7e819564e28c7dedd2a50eab1d3ce160a7005269c1448a76257c23adc57d0cd1fc9288fe448ccf00bc6d1a8b67b3a2527162f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arcs-doc"

RDEPENDS:${PN} += ""

inherit rpm
