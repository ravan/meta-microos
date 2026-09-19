SUMMARY = "Daemon for creating and maintaining an ISATAP client tunnel (RFC 5214)"
DESCRIPTION = "The daemon uses the in-kernel ISATAP support first introduced in Linux 2.6.25. \
It does NOT operate the tunnel or handle any IPv6 traffic, it only sets \
up the tunnel parameters, the Potential Router List, sends periodic \
router solicitations and tries to detect link changes."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.7+git.20141015"

RPM_NAME = "isatapd-0.9.7+git.20141015-5.5.aarch64.rpm"
RPM_HASH = "ad700f2e86b2059b5edac00242ca0b4b8aefbdad89fa390e8923da1b910f446ec61bda05f8eda459a41512984ad6159bdf957e395d255cf1b2cf42db2f358865"

RPROVIDES:${PN} += "isatapd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
