SUMMARY = "Documentation for texlive-multinotes"
DESCRIPTION = "This package includes the documentation for texlive-multinotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75610"

RPM_NAME = "texlive-multinotes-doc-2026.226.1.1svn75610-61.2.noarch.rpm"
RPM_HASH = "1851c79b75f75635add8e222ec06574e2b9795fc8a146fefc3d501e8dc13fc59cb64a013158a21695b935b2b6bbdce1660bcf2148885eabe4cc5b26a05b1448d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multinotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
