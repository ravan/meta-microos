SUMMARY = "Documentation for texlive-luacas"
DESCRIPTION = "This package includes the documentation for texlive-luacas"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn67247"

RPM_NAME = "texlive-luacas-doc-2026.226.1.0.2svn67247-59.2.noarch.rpm"
RPM_HASH = "68b8c174a2f1839b78b61c61bddc53d63c63c4927635432b9cad85224c51c62a44acc58d8e811ca307042de736e4930db5726a9419456de712616e1edd704232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacas-doc"

RDEPENDS:${PN} += ""

inherit rpm
