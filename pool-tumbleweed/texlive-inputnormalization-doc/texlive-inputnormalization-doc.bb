SUMMARY = "Documentation for texlive-inputnormalization"
DESCRIPTION = "This package includes the documentation for texlive-inputnormalization"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn78101"

RPM_NAME = "texlive-inputnormalization-doc-2026.226.0.0.2svn78101-60.2.noarch.rpm"
RPM_HASH = "094e3640584a6a384be35272b5d374a0cabcb61759ad40e357389fd314106e568b3bc55b4182c312d3d663b9d38f4002bf0706b54c85fa08ac009decb3890748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputnormalization-doc"

RDEPENDS:${PN} += ""

inherit rpm
