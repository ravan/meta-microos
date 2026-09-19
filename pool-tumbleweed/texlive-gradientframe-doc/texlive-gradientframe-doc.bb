SUMMARY = "Documentation for texlive-gradientframe"
DESCRIPTION = "This package includes the documentation for texlive-gradientframe"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-doc-2026.226.0.0.2svn21387-60.4.noarch.rpm"
RPM_HASH = "783358194f079561ee67ba95c6a4e6fb48d42ea9a72526a1fc294f6b2fca864e9907d06d59891f709495d047623dc9015eb03be554af4c160563f7a3eb931e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradientframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
