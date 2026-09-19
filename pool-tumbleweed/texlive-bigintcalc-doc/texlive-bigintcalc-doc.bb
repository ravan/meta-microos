SUMMARY = "Documentation for texlive-bigintcalc"
DESCRIPTION = "This package includes the documentation for texlive-bigintcalc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-bigintcalc-doc-2026.226.1.5svn77682-61.2.noarch.rpm"
RPM_HASH = "880e9c312b0416ce4a7931d0ef2ea5f8d747399e4e39dcf317aa5d42a84a499c4ba43e38d388beb0b36fe11714d4d88858b965f923bd9816a7d363b4f981f784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bigintcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
