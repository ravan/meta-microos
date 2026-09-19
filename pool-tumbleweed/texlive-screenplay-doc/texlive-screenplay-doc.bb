SUMMARY = "Documentation for texlive-screenplay"
DESCRIPTION = "This package includes the documentation for texlive-screenplay"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn27223"

RPM_NAME = "texlive-screenplay-doc-2026.226.1.6svn27223-60.2.noarch.rpm"
RPM_HASH = "5eb1f57db0e11697c35020cff1bb976b05559926d5cfc084dbd2d11ff938c246f2f0282837dc50c7b41a78866876e300f1b792ae3f5d4434a998737bfc9e6a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-screenplay-doc"

RDEPENDS:${PN} += ""

inherit rpm
