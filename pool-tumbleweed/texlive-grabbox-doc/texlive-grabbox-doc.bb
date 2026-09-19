SUMMARY = "Documentation for texlive-grabbox"
DESCRIPTION = "This package includes the documentation for texlive-grabbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn65223"

RPM_NAME = "texlive-grabbox-doc-2026.226.1.4svn65223-60.4.noarch.rpm"
RPM_HASH = "0be92250433c8905e23759d4e319f377f844cfcf7357d35d0a2d85ebef40bf396ee2a3f2db78fa63ab336ae8d09fccfbdac9b5de32028aece015398a679d611e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grabbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
