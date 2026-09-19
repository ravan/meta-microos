SUMMARY = "Documentation for texlive-fouriernc"
DESCRIPTION = "This package includes the documentation for texlive-fouriernc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-fouriernc-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "0385d4b908092160ac54515cc707f69c439f64046cffec78d914b4c591ea84f6bd7e6ac988a0dab639982cc4a47e19340988609623bc02b22c499a96755af440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fouriernc-doc"

RDEPENDS:${PN} += ""

inherit rpm
