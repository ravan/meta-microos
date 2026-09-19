SUMMARY = "Documentation for texlive-latexindent"
DESCRIPTION = "This package includes the documentation for texlive-latexindent"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.24.7svn76064"

RPM_NAME = "texlive-latexindent-doc-2026.226.3.24.7svn76064-61.2.noarch.rpm"
RPM_HASH = "0f0080850b3c3d67b7f83be8c6f1e18ade03f76c39971ae073c700a93e699c3243fb3b75a9c96f654bed488385a1c766833aeb1f4a3dba9b2074e114a859b1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexindent-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
