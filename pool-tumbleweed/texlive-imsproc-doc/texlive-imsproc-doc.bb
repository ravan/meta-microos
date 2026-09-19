SUMMARY = "Documentation for texlive-imsproc"
DESCRIPTION = "This package includes the documentation for texlive-imsproc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn29803"

RPM_NAME = "texlive-imsproc-doc-2026.226.0.0.1svn29803-60.2.noarch.rpm"
RPM_HASH = "700ee5e629de4a6c8bf12683f4ebfb625631b335e2725ddfc855de38fce1293b4b1b2ed821803f26bfd2e214fdff82dcd6220a9f0572b9c60f11c53da4de6be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imsproc-doc"

RDEPENDS:${PN} += ""

inherit rpm
