SUMMARY = "Documentation for texlive-hvextern"
DESCRIPTION = "This package includes the documentation for texlive-hvextern"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.42svn76924"

RPM_NAME = "texlive-hvextern-doc-2026.226.0.0.42svn76924-60.2.noarch.rpm"
RPM_HASH = "bdeea331679f789b91c9223d55f61670f7fc90e810797a1032974891f128380e99e1362d8f78a29b55284d35781790821828046f0ee3d008bce9a81b88384925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvextern-doc"

RDEPENDS:${PN} += ""

inherit rpm
