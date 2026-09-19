SUMMARY = "Documentation for texlive-factura"
DESCRIPTION = "This package includes the documentation for texlive-factura"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.32svn61697"

RPM_NAME = "texlive-factura-doc-2026.226.4.32svn61697-59.2.noarch.rpm"
RPM_HASH = "1426dd38a5f52025a4b91de6e865b49e525f6b5204c625d16dd441eae15de92181aa84dbb2345e5a9097595e56b9e58cbfb5738721a3693839b2bfc90e7472d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-factura-doc-es-VE \
texlive-factura-doc"

RDEPENDS:${PN} += ""

inherit rpm
