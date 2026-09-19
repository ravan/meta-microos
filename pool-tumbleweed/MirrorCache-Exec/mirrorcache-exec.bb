SUMMARY = "MirrorCache worker to execute scheduled tasks"
DESCRIPTION = "MirrorCache worker to execute scheduled shell scripts"
LICENSE = "GPL-2.0-or-later"

PV = "1.105"

RPM_NAME = "MirrorCache-Exec-1.105-1.2.noarch.rpm"
RPM_HASH = "0f2f084da6df9a0fa250fce8cdcca26fa9eb28594a3a0d7a720dfbf0c8f4f43cfa1185a8e438cd5773990512aa2a644a25d9608d2abb1bc45cc1a45348925793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MirrorCache-Exec \
group-mirrorcache \
group-mirrorcache-exec \
user-mirrorcache-exec"

RDEPENDS:${PN} += "/usr/bin/sh \
MirrorCache-common \
sysuser-shadow \
user-mirrorcache"

inherit rpm
