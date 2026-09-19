SUMMARY = "Documentation for texlive-letltxmacro"
DESCRIPTION = "This package includes the documentation for texlive-letltxmacro"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-letltxmacro-doc-2026.226.1.6svn77682-61.2.noarch.rpm"
RPM_HASH = "e6afbdaf335ed79f4ad6a89bc8441fb7bbe7d2e79e692a625ecf6db1748d5c0088b9850591f47f711acb2c8ed2a875788c36e580b310417780175f2f1641e70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-letltxmacro-doc-en \
texlive-letltxmacro-doc"

RDEPENDS:${PN} += ""

inherit rpm
