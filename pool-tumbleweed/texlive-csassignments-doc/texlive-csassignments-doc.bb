SUMMARY = "Documentation for texlive-csassignments"
DESCRIPTION = "This package includes the documentation for texlive-csassignments"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77161"

RPM_NAME = "texlive-csassignments-doc-2026.226.1.0.2svn77161-61.2.noarch.rpm"
RPM_HASH = "4a9d9d4cc71911dffe77d67376e832a170ba12a054c8b62293372964bb31be7b9468d6e1ead7e390183310a9e64386a266ae55fdbc616550896ff7489448bbeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csassignments-doc"

RDEPENDS:${PN} += ""

inherit rpm
