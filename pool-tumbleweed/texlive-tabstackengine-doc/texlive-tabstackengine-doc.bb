SUMMARY = "Documentation for texlive-tabstackengine"
DESCRIPTION = "This package includes the documentation for texlive-tabstackengine"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.10svn46848"

RPM_NAME = "texlive-tabstackengine-doc-2026.227.2.10svn46848-62.2.noarch.rpm"
RPM_HASH = "42e96e8ae2973df925613a05bd82e6db080db867f6e976de2540c29bec1223627f97f4518af69f4d9a55fc00398654527005424c86201fbba50510141cd69f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabstackengine-doc"

RDEPENDS:${PN} += ""

inherit rpm
