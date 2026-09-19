SUMMARY = "Automatic SELinux relabelling during early boot"
DESCRIPTION = "This package contains a dracut module and systemd generator for relabelling \
the system during early boot."
LICENSE = "GPL-2.0-or-later"

PV = "4.0+git29"

RPM_NAME = "selinux-autorelabel-4.0+git29-1.1.aarch64.rpm"
RPM_HASH = "fd9a485b8e3c41de6a3129804accfa20096ec7fd61cfa1d95ef549d79c95043e559841fa80ef5b77887c5b956cbb25c3427b81448d82fbaf505da9a95f47bda9"

RPROVIDES:${PN} += "selinux-autorelabel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/findmnt \
/usr/bin/sh \
policycoreutils"

inherit rpm
