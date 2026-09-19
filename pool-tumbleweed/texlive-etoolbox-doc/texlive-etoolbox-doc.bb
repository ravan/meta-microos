SUMMARY = "Documentation for texlive-etoolbox"
DESCRIPTION = "This package includes the documentation for texlive-etoolbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5msvn77682"

RPM_NAME = "texlive-etoolbox-doc-2026.226.2.5msvn77682-59.2.noarch.rpm"
RPM_HASH = "7cdbc43a8fca9de1fd616d111039ea489ceedbe79815eed2cbda01c4d24a6cdfe5e5623ae247991acdc33a5fdea7f271543a87c24255540fd50fbc7450823878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoolbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
