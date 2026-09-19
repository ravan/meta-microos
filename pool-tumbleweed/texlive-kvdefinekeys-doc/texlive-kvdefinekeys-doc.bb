SUMMARY = "Documentation for texlive-kvdefinekeys"
DESCRIPTION = "This package includes the documentation for texlive-kvdefinekeys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-kvdefinekeys-doc-2026.226.1.6svn77682-63.2.noarch.rpm"
RPM_HASH = "f3fbb82d7ef2c197f22ad88257ac5f3319b43c19841a170c6e0105cef3355d3b1e71ff8d5648af8e6bebe14e1fef20f80c5c35be0256134c1be0567238f7692e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kvdefinekeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
