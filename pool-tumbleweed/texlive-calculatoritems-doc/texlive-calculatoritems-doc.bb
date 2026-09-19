SUMMARY = "Documentation for texlive-calculatoritems"
DESCRIPTION = "This package includes the documentation for texlive-calculatoritems"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn76037"

RPM_NAME = "texlive-calculatoritems-doc-2026.226.0.0.1.4svn76037-59.2.noarch.rpm"
RPM_HASH = "3217cbb81ead96504b0695a3fd0f37b10e5f6eb44c3620293b36e3c13b06548372ebdd3a1651e45fe02881539a5095b49880e0a1d85feaa15b1ba7c656cbb419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calculatoritems-doc"

RDEPENDS:${PN} += ""

inherit rpm
