SUMMARY = "Documentation for texlive-metalogox"
DESCRIPTION = "This package includes the documentation for texlive-metalogox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.07svn77682"

RPM_NAME = "texlive-metalogox-doc-2026.226.1.07svn77682-61.2.noarch.rpm"
RPM_HASH = "36853b4fff2c1944fc117d8b8c2684534f719f7acc2e19a8c397ccf0381c12413cc08aa901ae04b33ae15bb5a0facb1cd0ffab021c739423fdff9c88a98a4654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metalogox-doc"

RDEPENDS:${PN} += ""

inherit rpm
