SUMMARY = "Documentation for texlive-els-cas-templates"
DESCRIPTION = "This package includes the documentation for texlive-els-cas-templates"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn71189"

RPM_NAME = "texlive-els-cas-templates-doc-2026.226.2.4svn71189-61.4.noarch.rpm"
RPM_HASH = "95e8a24aa7f313ee6a16d2057523100cc1312b1d054af866fb3dfd6a2bc05ba61e0338e049364914b6b9ca877487f63c8fa801c2a929078dd2e6d0d59386780c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-els-cas-templates-doc"

RDEPENDS:${PN} += ""

inherit rpm
