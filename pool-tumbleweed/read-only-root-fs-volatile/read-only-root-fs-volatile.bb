SUMMARY = "Dracut Module to mount a tmpfs overlay on a RO root"
DESCRIPTION = "A dracut module which mounts an overlayfs each on /etc and /var, with the upper \
layer in a tmpfs mount. This is the minimal setup to get a booting system, to \
have a writable /root or /home, additional fstab entries can be added."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+git20260311.ea26e1b"

RPM_NAME = "read-only-root-fs-volatile-1.0+git20260311.ea26e1b-1.2.noarch.rpm"
RPM_HASH = "c43f98422ee079c2ed81c23955ebe64c3395301ba6fa1cce11d52e507984c5cdbc06588657bfa829190d4485c6dde63a978f29ffec7bfe018f5ca0417ffb84a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "read-only-root-fs-volatile"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
