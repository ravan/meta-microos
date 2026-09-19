SUMMARY = "Documentation for texlive-hep-float"
DESCRIPTION = "This package includes the documentation for texlive-hep-float"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-float-doc-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "b415399936574625f30867ed437fa69167ee6a6b48ef8283db3d03aaeba91391044211f0e983366bfc726bfbb09f2347e181650eb594f69d108bbac940345bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-float-doc"

RDEPENDS:${PN} += ""

inherit rpm
