SUMMARY = "Documentation for texlive-windycity"
DESCRIPTION = "This package includes the documentation for texlive-windycity"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn67011"

RPM_NAME = "texlive-windycity-doc-2026.226.svn67011-60.2.noarch.rpm"
RPM_HASH = "331825b2f94882dd9ac62133371f26ca3aeb751781dffa4c72971ab72da5a3034d85a3b38adb537dd2fbf87643d32aff862f9b33cb4b9e981c4d7b02aea361a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-windycity-doc"

RDEPENDS:${PN} += ""

inherit rpm
