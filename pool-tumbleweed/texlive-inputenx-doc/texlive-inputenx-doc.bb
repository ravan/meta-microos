SUMMARY = "Documentation for texlive-inputenx"
DESCRIPTION = "This package includes the documentation for texlive-inputenx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn77682"

RPM_NAME = "texlive-inputenx-doc-2026.226.1.12svn77682-60.2.noarch.rpm"
RPM_HASH = "ccca24d9ab5fea971698b4858e119d3aa003cfdc9ff8bdb9c46747dd652451be5efa9ec106190f15b1d179267f978bc7fcd95660ee2abb71a03a1fea0b237d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputenx-doc"

RDEPENDS:${PN} += ""

inherit rpm
