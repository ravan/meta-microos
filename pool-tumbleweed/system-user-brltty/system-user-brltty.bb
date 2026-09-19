SUMMARY = "System user and group named brltty"
DESCRIPTION = "System user for the Braille display driver for Linux/Unix"
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "system-user-brltty-6.9.1-2.1.noarch.rpm"
RPM_HASH = "34f91deabc60e9db1fc004aa27975856f2b7e12d87a5406aa3fbefa68f55c927560f6112918d0c4aa01cf4d333e0298c69bcae24bb478a78a0c00ff69a08b3f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-brlapi \
group-brltty \
system-user-brltty \
user-brltty"

RDEPENDS:${PN} += "/usr/bin/sh \
group-audio \
group-dialout \
group-input \
group-pulse-access \
group-root \
group-tty \
sysuser-shadow"

inherit rpm
