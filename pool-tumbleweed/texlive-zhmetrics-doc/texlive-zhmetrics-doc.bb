SUMMARY = "Documentation for texlive-zhmetrics"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics"
LICENSE = "LPPL-1.0"

PV = "2026.226.r206svn22207"

RPM_NAME = "texlive-zhmetrics-doc-2026.226.r206svn22207-59.4.noarch.rpm"
RPM_HASH = "536aa1517f62a4a4257a0e81b0c5b4f797827709797ac149fc136a6f389651884fc82312f76539a12bd493809850ca3aa8db89055116ab83b23443d1b8acbc91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-doc"

RDEPENDS:${PN} += ""

inherit rpm
