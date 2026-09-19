SUMMARY = "Documentation for texlive-pst-diffraction"
DESCRIPTION = "This package includes the documentation for texlive-pst-diffraction"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.06asvn71819"

RPM_NAME = "texlive-pst-diffraction-doc-2026.226.2.06asvn71819-59.2.noarch.rpm"
RPM_HASH = "966f2e1b058c14818e3fcc29c43b690663b2529b9e81940e4aa17f07e87af40013764d3b3f041593edb9a364931682a59b8a7d276e590a6a3e0c93b4533acf9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-diffraction-doc"

RDEPENDS:${PN} += ""

inherit rpm
