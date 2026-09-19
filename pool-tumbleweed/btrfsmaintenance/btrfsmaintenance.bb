SUMMARY = "Scripts for btrfs periodic maintenance tasks"
DESCRIPTION = "Scripts for btrfs maintenance tasks like periodic scrub, balance, trim or defrag \
on selected mountpoints or directories. Hints for periodic snapshot tuning (eg. \
for snapper)."
LICENSE = "GPL-2.0-only"

PV = "0.5.2"

RPM_NAME = "btrfsmaintenance-0.5.2-2.6.noarch.rpm"
RPM_HASH = "d9549fc6ec133dd18c95bdc1a5ac36b2ac089d53db5af5c8c7f624a5054623fc9df43fc57bc7a201eec541579b31c5a4922f294f8ef75052599bce20c48d73c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "btrfsmaintenance"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
btrfsprogs"

inherit rpm
