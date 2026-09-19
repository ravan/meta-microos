SUMMARY = "Documentation for texlive-centeredline"
DESCRIPTION = "This package includes the documentation for texlive-centeredline"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-centeredline-doc-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "d9b04a71659614c489acbf343843f7012336711a6e4863748096a85374dd21b349efb0c493bcb166b5862116f05d608cd58938583e4fe303444487e63d2787e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-centeredline-doc"

RDEPENDS:${PN} += ""

inherit rpm
