SUMMARY = "Documentation for texlive-bold-extra"
DESCRIPTION = "This package includes the documentation for texlive-bold-extra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn78101"

RPM_NAME = "texlive-bold-extra-doc-2026.226.0.0.1svn78101-59.2.noarch.rpm"
RPM_HASH = "6f040b78397e826f7f83defc5cafa1ebf34f3516318f41c568c5dd7a46ab69a3f0752cad1a0eb22e41ee386e3ce2d67b3dac7c8af8f9c51df1e863a13f68c9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bold-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
