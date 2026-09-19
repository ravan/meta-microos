SUMMARY = "Documentation for texlive-metapost"
DESCRIPTION = "This package includes the documentation for texlive-metapost"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-metapost-doc-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "11f6cdb2da6138497aaa34dcd6108b00d4d2e03978811e155b85753b0a886bfa0770a8daeabf92796eecff647430f5c32304298d2cb7bb233351128087b28cf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvitomp.1 \
man-mpost.1 \
texlive-metapost-doc"

RDEPENDS:${PN} += ""

inherit rpm
