SUMMARY = "Documentation for texlive-textpath"
DESCRIPTION = "This package includes the documentation for texlive-textpath"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.6svn15878"

RPM_NAME = "texlive-textpath-doc-2026.227.1.6svn15878-62.2.noarch.rpm"
RPM_HASH = "1c6c0dc0032e8bc9aaed71a70bc6267fce2f09f4b615ad0ccb186bf5a7325a6de2787e04fd724c122b3b2fac5bf9c419f5eed0c332bad559a2adecfcf6ed4f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textpath-doc"

RDEPENDS:${PN} += ""

inherit rpm
