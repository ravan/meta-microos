SUMMARY = "Documentation for texlive-bibhtml"
DESCRIPTION = "This package includes the documentation for texlive-bibhtml"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.2svn31607"

RPM_NAME = "texlive-bibhtml-doc-2026.226.2.0.2svn31607-61.2.noarch.rpm"
RPM_HASH = "e1325a2a24f1dac96ed089a4857d07d31f6ded23e54dbd5986fb6ad8107f10f2a4dbd8255f69a30b67f155ee36867671a5fd3bd993bbaab3f33626cc9796e82d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibhtml-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
