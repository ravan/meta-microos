SUMMARY = "Documentation for texlive-a2ping"
DESCRIPTION = "This package includes the documentation for texlive-a2ping"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.84psvn52964"

RPM_NAME = "texlive-a2ping-doc-2026.226.2.84psvn52964-61.2.noarch.rpm"
RPM_HASH = "3d04851f1e35fbc848cdc05b3ae2b1ba6dbaadd0a6613812af6e8e2a1fe425c3071b966ce8c34fdb022f00fd29b1e8bb6443fb5dfeffa6f484ded3f9b5763c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-a2ping.1 \
texlive-a2ping-doc"

RDEPENDS:${PN} += ""

inherit rpm
