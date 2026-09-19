SUMMARY = "Documentation for texlive-wsuipa"
DESCRIPTION = "This package includes the documentation for texlive-wsuipa"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25469"

RPM_NAME = "texlive-wsuipa-doc-2026.226.svn25469-59.4.noarch.rpm"
RPM_HASH = "d2d722195d3950c294b0feaf5dd8734a07e58607bfafd78fea89368532222c1ab2197bc7548809ef1a6e15217d821cbcf3f8e29562e5eca6ba169f6b9eec9c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsuipa-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
