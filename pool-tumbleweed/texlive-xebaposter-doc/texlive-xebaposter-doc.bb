SUMMARY = "Documentation for texlive-xebaposter"
DESCRIPTION = "This package includes the documentation for texlive-xebaposter"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.54svn75290"

RPM_NAME = "texlive-xebaposter-doc-2026.226.2.54svn75290-59.4.noarch.rpm"
RPM_HASH = "2624d729964794ec4749b91849e2a022ad91973c265d8ed9118cd9ce62e788b98bda010d4432dc6d8ba3a00c6ff1827b322b7e899f65cd93eeb7942317f1288e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xebaposter-doc-fa \
texlive-xebaposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
