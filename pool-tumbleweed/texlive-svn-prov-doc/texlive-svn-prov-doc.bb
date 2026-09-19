SUMMARY = "Documentation for texlive-svn-prov"
DESCRIPTION = "This package includes the documentation for texlive-svn-prov"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1862svn77682"

RPM_NAME = "texlive-svn-prov-doc-2026.226.3.1862svn77682-64.2.noarch.rpm"
RPM_HASH = "e519950f9952d73f9c68ae46d1e133040ad7dc4c5754576328ed1d91e97676b8cd62c646c4f1838c35a5293da94d3bd3b51cca8d33203d8638750c1fa10b83c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svn-prov-doc"

RDEPENDS:${PN} += ""

inherit rpm
