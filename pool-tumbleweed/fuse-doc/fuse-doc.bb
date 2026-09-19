SUMMARY = "Document package for FUSE (userspace filesystem)"
DESCRIPTION = "This package contains the documentation for FUSE (userspace filesystem)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-doc-2.9.9-8.6.noarch.rpm"
RPM_HASH = "5250a53e01c4a1a9fb67687312bc62472ba1b441907cbb2f536bb255fa7db0d8a56499071eecd048a137893354256276683f7292997507789d266ec8ccb419e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fuse-doc"

RDEPENDS:${PN} += ""

inherit rpm
