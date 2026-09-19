SUMMARY = "Documentation for texlive-longfbox"
DESCRIPTION = "This package includes the documentation for texlive-longfbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39028"

RPM_NAME = "texlive-longfbox-doc-2026.226.1.0svn39028-61.2.noarch.rpm"
RPM_HASH = "4b2fe650c4aea4e8f17e59b0fac0ef30e12b8df6a627831ff8a411c7054f537815f06ad49e341e4d748d74642fdc0cd244c086295486b36f3ab294c8d63ba113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longfbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
