SUMMARY = "Cockpit user interface for storage, using udisks"
DESCRIPTION = "The Cockpit component for managing storage.  This package uses udisks."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-storaged-365-2.1.noarch.rpm"
RPM_HASH = "9767b5730eaae274376a180f2a94571734907d5ff61b31b70b29f9b9fcc9ff04d706eb6696115f1af4e085aa23a49b67ffa64ef2d479348bdb3544d43c4f756a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-storaged"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
cockpit-shell \
libudisks2-0-btrfs \
libudisks2-0-lvm2 \
python3-dbus-python \
udisks2"

inherit rpm
