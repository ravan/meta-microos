SUMMARY = "Documentation for texlive-simplenodes"
DESCRIPTION = "This package includes the documentation for texlive-simplenodes"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn62888"

RPM_NAME = "texlive-simplenodes-doc-2026.226.svn62888-60.2.noarch.rpm"
RPM_HASH = "d8ba6a1f9b62201db7b45ce1ef3271ec4bd7d2e25372ff462dca48d479cf97e31c22b4da4c0db35fbfef560c69e0c56a671960af66992cc5487c75ac50b8e97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplenodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
