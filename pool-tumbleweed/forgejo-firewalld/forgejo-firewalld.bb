SUMMARY = "Firewalld profile for forgejo"
DESCRIPTION = "This package adds a firewalld service profile to forgejo"
LICENSE = "GPL-3.0-or-later"

PV = "16.0.3"

RPM_NAME = "forgejo-firewalld-16.0.3-1.1.noarch.rpm"
RPM_HASH = "416f7bb24ca207c9befee96c9cc40162cf1f7791560f6d61b9ef9aa1f4295b2592144e5823b3d829356809bbd3ac5e0a4c72056c496bf72df2b66e83f4cfeb01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forgejo-firewalld"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
