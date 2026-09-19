SUMMARY = "Documentation for texlive-pst-mirror"
DESCRIPTION = "This package includes the documentation for texlive-pst-mirror"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02asvn71294"

RPM_NAME = "texlive-pst-mirror-doc-2026.226.1.02asvn71294-59.2.noarch.rpm"
RPM_HASH = "44c18e4bf6b09e95831c7828fb380d2f56426c05571306d6f4edf4c814a46806f4589db37372847409cfa922b05f1c04963c52f3bb94bfe700b691a1b22131f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-mirror-doc-fr \
texlive-pst-mirror-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
