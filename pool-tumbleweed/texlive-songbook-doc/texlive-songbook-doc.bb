SUMMARY = "Documentation for texlive-songbook"
DESCRIPTION = "This package includes the documentation for texlive-songbook"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.4.5svn18136"

RPM_NAME = "texlive-songbook-doc-2026.226.4.5svn18136-64.2.noarch.rpm"
RPM_HASH = "e0997bb8d5eedf0d927f34f277d3145636ab96d4aa6312d883d281479a6d6c4192e535e652fb19ff00c03b269fd0e7268fa51bb2b21c9e1d03f3ba3060e80fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-songbook-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
