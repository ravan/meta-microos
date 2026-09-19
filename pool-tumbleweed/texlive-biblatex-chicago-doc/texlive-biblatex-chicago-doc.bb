SUMMARY = "Documentation for texlive-biblatex-chicago"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-chicago"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3bsvn77682"

RPM_NAME = "texlive-biblatex-chicago-doc-2026.226.2.3bsvn77682-61.2.noarch.rpm"
RPM_HASH = "d2f45f00134581367e6920fc51735d79938fde4095fc011eb1f017a5141953b8cb0b0c7a4e202bf48c817367110fa93c805fd41716f005f20c7804e35df0bd9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-chicago-doc"

RDEPENDS:${PN} += ""

inherit rpm
