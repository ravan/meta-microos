SUMMARY = "Documentation for texlive-schemata"
DESCRIPTION = "This package includes the documentation for texlive-schemata"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76178"

RPM_NAME = "texlive-schemata-doc-2026.226.1.5svn76178-60.2.noarch.rpm"
RPM_HASH = "50c8c989a72be6066b7a85b1e914e9cd93e86bebbafdfc1f483312cbfcdf96f793bf62104fa110715ce3ec6f39e9038b53c9ec70fcc1599172070b2f1324f813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schemata-doc"

RDEPENDS:${PN} += ""

inherit rpm
