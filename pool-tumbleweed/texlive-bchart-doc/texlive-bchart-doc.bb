SUMMARY = "Documentation for texlive-bchart"
DESCRIPTION = "This package includes the documentation for texlive-bchart"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn43928"

RPM_NAME = "texlive-bchart-doc-2026.226.0.0.1.3svn43928-61.2.noarch.rpm"
RPM_HASH = "f358bc92c9b4f2f54d18f34605ad1d1fce6ae3c26cc52ab8025fada1029c04db055a6111ad66bf025fb919ac0ddc70293b99f019d3c1532303b6c01e678b0961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
