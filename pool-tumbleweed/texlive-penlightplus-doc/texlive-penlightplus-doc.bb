SUMMARY = "Documentation for texlive-penlightplus"
DESCRIPTION = "This package includes the documentation for texlive-penlightplus"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74000"

RPM_NAME = "texlive-penlightplus-doc-2026.226.svn74000-58.2.noarch.rpm"
RPM_HASH = "25b8ab34de366acbc21ff96851e717544a77389b603f6b48bcbde7ffc9013c5c3a3b64e83838f66cfd3d56655e7af25713d98bf864fc1649f4b173096d8fa9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-penlightplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
