SUMMARY = "Documentation for texlive-datetime2-welsh"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-welsh"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52553"

RPM_NAME = "texlive-datetime2-welsh-doc-2026.226.1.1svn52553-59.2.noarch.rpm"
RPM_HASH = "e06084b998d718a0b4649eb56aaa8ee6c7b73d32b530a9b7990390b20e4da15ea5fc0b345f4e3d2530f566ad8ada89d8e2959e4aa47ac6c41fba6fa9edcd41a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-welsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
