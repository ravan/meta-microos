SUMMARY = "Documentation for texlive-uiucthesis"
DESCRIPTION = "This package includes the documentation for texlive-uiucthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.25svn15878"

RPM_NAME = "texlive-uiucthesis-doc-2026.226.2.25svn15878-60.2.noarch.rpm"
RPM_HASH = "a096730ac010581321c0462a412285b4e434cf448704b7f9c96ed903b87c95769a08a1c6f83528fc04f660a0584a352c2adcba9f55b3f34cdd0958cc52ecafcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uiucthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
