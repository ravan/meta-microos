SUMMARY = "Documentation for texlive-cooltooltips"
DESCRIPTION = "This package includes the documentation for texlive-cooltooltips"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn60201"

RPM_NAME = "texlive-cooltooltips-doc-2026.226.1.1svn60201-61.2.noarch.rpm"
RPM_HASH = "a8f99829048d36d126028b4709c4ee55b142c4ee93afbab7112546ff14b95f03aca6d91d572d8e9d35939e03f20a7054ae26a6c93af124709b39d0ca3e856118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooltooltips-doc"

RDEPENDS:${PN} += ""

inherit rpm
