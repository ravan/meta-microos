SUMMARY = "Busybox applets replacing util-linux"
DESCRIPTION = "This package contains the symlinks to replace util-linux with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-util-linux-1.38.0-42.2.noarch.rpm"
RPM_HASH = "1c170a29a2f3727fec7b56d28568a681b7340398ceda2b233b156115343c5b8b5d81a3074d7a1b0c8ad8977c63b0398b409e625140c49e7440a4f75010660eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/kill \
/usr/bin/logger \
/usr/bin/more \
/usr/bin/mount \
/usr/bin/su \
/usr/bin/umount \
busybox-util-linux"

RDEPENDS:${PN} += "busybox"

inherit rpm
