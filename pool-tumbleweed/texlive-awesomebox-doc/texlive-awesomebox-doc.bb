SUMMARY = "Documentation for texlive-awesomebox"
DESCRIPTION = "This package includes the documentation for texlive-awesomebox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn57349"

RPM_NAME = "texlive-awesomebox-doc-2026.226.0.0.6svn57349-60.2.noarch.rpm"
RPM_HASH = "41381e09442f4f48fffac339102cb49f275a561df8705bc802d00bbd5f2e8fc2184724e4498ffa906d1acb8bc2ba5d14c15d85ad37707fcc105f62fb7f7d3737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-awesomebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
