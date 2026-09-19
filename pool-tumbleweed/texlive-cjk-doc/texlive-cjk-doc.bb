SUMMARY = "Documentation for texlive-cjk"
DESCRIPTION = "This package includes the documentation for texlive-cjk"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.8.5svn60865"

RPM_NAME = "texlive-cjk-doc-2026.226.4.8.5svn60865-60.2.noarch.rpm"
RPM_HASH = "cc4b8bf0c11b96661523d60f62d97ae4ba5de82fbe196b076d3cf48d6cebd2df51f6b4e585cf7cc33826e4834ae8f488ce674240e7acf148a981e519ae33e96c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjk-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
