SUMMARY = "Home Area/User Account Manager"
DESCRIPTION = "This package contains systemd-homed.service, a system service that manages home \
directories of users. The home directories managed are self-contained, and thus \
include the user's full metadata record in the home's data storage itself, \
making them easy to migrate between machines; the user account and home \
directory becoming the same concept. \
 \
This package also includes homectl(1), a tool to interact with systemd-homed and \
PAM module to automatically mount home directories on user login. \
 \
See homectl(1) man page for instructions to create a new user account. \
 \
A description of the various storage mechanisms implemented by systemd-homed can \
be found at https://systemd.io/HOME_DIRECTORY/. \
 \
Note that nss-systemd has still not been integrated into nsswitch and therefore \
needs to be added manually into /etc/nsswitch.conf, see nss-systemd(8) man page \
for an example on how to do that."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-homed-261.2-1.2.aarch64.rpm"
RPM_HASH = "70b8846258ae62390d11c4b5b8e456ba65f500249f75f24d642b3ceb307cd6318480187d9df06d8ac8b76d239c2e6420d31330d7a53aba5b65b8a95b31fdbdeb"

RPROVIDES:${PN} += "systemd-homed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-261.2-1.2.so \
systemd"

inherit rpm
