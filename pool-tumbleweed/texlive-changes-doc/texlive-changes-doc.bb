SUMMARY = "Documentation for texlive-changes"
DESCRIPTION = "This package includes the documentation for texlive-changes"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2.1svn77682"

RPM_NAME = "texlive-changes-doc-2026.226.4.2.1svn77682-59.2.noarch.rpm"
RPM_HASH = "f36414ecfdebb1a5559dfb46dad425872495199a1b1a6c868fd43206a60d265e30d5a58160b4e907a21b207001c675654f8bd728e336ff03993d4c19e6a80d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-changes-doc-en;de \
texlive-changes-doc"

RDEPENDS:${PN} += ""

inherit rpm
