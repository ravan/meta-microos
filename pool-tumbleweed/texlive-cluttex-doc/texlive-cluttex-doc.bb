SUMMARY = "Documentation for texlive-cluttex"
DESCRIPTION = "This package includes the documentation for texlive-cluttex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7.0svn74655"

RPM_NAME = "texlive-cluttex-doc-2026.226.0.0.7.0svn74655-60.2.noarch.rpm"
RPM_HASH = "2dbba6a395d412ed4cfe7ebd46c0bb833bfc216a202db9dc9a2874c66b00f1459b4658d4daf0902b5588f07895110cb1c6ccf93cd9cb90eacc2311a9ebf8c73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cluttex-doc-ja;en \
man-cllualatex.1 \
man-cluttex.1 \
man-clxelatex.1 \
texlive-cluttex-doc"

RDEPENDS:${PN} += ""

inherit rpm
