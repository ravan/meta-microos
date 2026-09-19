SUMMARY = "Documentation for texlive-luakeyval"
DESCRIPTION = "This package includes the documentation for texlive-luakeyval"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76992"

RPM_NAME = "texlive-luakeyval-doc-2026.226.0.0.1svn76992-59.2.noarch.rpm"
RPM_HASH = "830a20b332d3eb4f23047b92182cb59f22eeb2ced201f9934c079c8ff1e4b3109203e8a86225e08537ace7da5100e9e412c499ae4441a805b70b08c5a6cee93a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luakeyval-doc"

RDEPENDS:${PN} += ""

inherit rpm
