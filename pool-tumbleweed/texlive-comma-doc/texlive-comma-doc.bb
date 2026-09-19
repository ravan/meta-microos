SUMMARY = "Documentation for texlive-comma"
DESCRIPTION = "This package includes the documentation for texlive-comma"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn18259"

RPM_NAME = "texlive-comma-doc-2026.226.1.2svn18259-60.2.noarch.rpm"
RPM_HASH = "0155d91dd52bd2805b8b18192138e272681b9929494a43e7fba9fbcd9df586bda82793073579a509fdd60a0db477c613da293c53f5106f835ec807361c8835c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comma-doc"

RDEPENDS:${PN} += ""

inherit rpm
