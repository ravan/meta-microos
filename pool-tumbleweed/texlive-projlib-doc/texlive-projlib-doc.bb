SUMMARY = "Documentation for texlive-projlib"
DESCRIPTION = "This package includes the documentation for texlive-projlib"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-projlib-doc-2026.226.svn78004-59.2.noarch.rpm"
RPM_HASH = "6c54e863c55d22b2b1e25988716201df7deb0855e1cd1bf6feaffa19bed77c63e50a349e52fc9cc68e7e464a573903a3eef8f52d476435ec5e0cf06689310cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-projlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
