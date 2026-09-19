SUMMARY = "Symlinks and syncs browser profile dirs to RAM thus reducing HDD/SDD calls"
DESCRIPTION = "Profile-sync-daemon (psd) is a tiny pseudo-daemon designed to manage your \
browser's profile in tmpfs and to periodically sync it back to your physical \
disc (HDD/SSD). This is accomplished via a symlinking step and an innovative \
use of rsync to maintain back-up and synchronization between the two. One of \
the major design goals of psd is a completely transparent user experience."
LICENSE = "MIT"

PV = "7.04"

RPM_NAME = "profile-sync-daemon-7.04-1.1.noarch.rpm"
RPM_HASH = "f9b71751a1950f938f7267b55f9d6719919e28bc914be92db78a6dadad07771cbb76dd6bf4e86c94649edf5ea7b5a38f17588ae44afc2d73dbc878eb1074c27f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "profile-sync-daemon"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
rsync"

inherit rpm
