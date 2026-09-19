SUMMARY = "Documentation for texlive-chronosys"
DESCRIPTION = "This package includes the documentation for texlive-chronosys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn26700"

RPM_NAME = "texlive-chronosys-doc-2026.226.1.2svn26700-60.2.noarch.rpm"
RPM_HASH = "a04d1cfea62bfb94eacbaadb9b3f24e248c5582a98439561ab5f529d1556699cbae8ce6bf6c115055a2bb7373d06ba30677717bbacb4f8127971fa811f297ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chronosys-doc-en;fr \
texlive-chronosys-doc"

RDEPENDS:${PN} += ""

inherit rpm
