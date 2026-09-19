SUMMARY = "Transactional Updates with btrfs and snapshots"
DESCRIPTION = "transactional-update is a tool to update a system in an atomic \
way with zypper, btrfs and snapshots."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.1.3"

RPM_NAME = "transactional-update-6.1.3-1.2.aarch64.rpm"
RPM_HASH = "00ae157c353995649a20c5c1baa74380ecff7b153080d766d15877641fa8e2f80b8262479c4dffaebd325a0ae61f1982d322f8507c9ef73d2a2c1db774743493"

RPROVIDES:${PN} += "transactional-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/bc \
/usr/bin/sh \
dracut-transactional-update \
logrotate \
lsof \
psmisc \
tukit \
zypper"

inherit rpm
