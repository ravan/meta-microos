SUMMARY = "Documentation for texlive-poltawski"
DESCRIPTION = "This package includes the documentation for texlive-poltawski"
LICENSE = "LPPL-1.3c"

PV = "2026.226.1.101svn77682"

RPM_NAME = "texlive-poltawski-doc-2026.226.1.101svn77682-59.2.noarch.rpm"
RPM_HASH = "22234f8a259ad846117883f0e5023152a170aedc08856a7b3e42c28f337a9e977cd548049f9f46d8ca058f500bfb93697e272418d4afade9e2a2e70d1496c8b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poltawski-doc"

RDEPENDS:${PN} += ""

inherit rpm
