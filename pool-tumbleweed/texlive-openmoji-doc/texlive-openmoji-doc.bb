SUMMARY = "Documentation for texlive-openmoji"
DESCRIPTION = "This package includes the documentation for texlive-openmoji"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn77186"

RPM_NAME = "texlive-openmoji-doc-2026.226.0.0.1.1svn77186-61.2.noarch.rpm"
RPM_HASH = "7f717a6e6e289e674291fee0cd034798655d02ff4e6eab87290c86c5b5fd3240bfbc80511d45c23816f057d8b64f3f310cc1a8026a8ce6e8b082c6318c166677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-openmoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
