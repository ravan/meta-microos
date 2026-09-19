SUMMARY = "Documentation for texlive-bussproofs"
DESCRIPTION = "This package includes the documentation for texlive-bussproofs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-bussproofs-doc-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "5f3ec641c88dbfae6411ebc63e00264ed97fe703105d62b1f07f74c0b1e67fc8de3a621f6008473734ab96babdc31e56381d2fc634f9e924fd72139398d10bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bussproofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
