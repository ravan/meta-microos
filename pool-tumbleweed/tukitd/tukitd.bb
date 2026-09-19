SUMMARY = "D-Bus controlling service for transactional updates"
DESCRIPTION = "This package provedes the D-Bus service to access libtukit8's \
functionality to manage transactional systems."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.3"

RPM_NAME = "tukitd-6.1.3-1.2.aarch64.rpm"
RPM_HASH = "08f7d5cfdf04f829bbdf7d78cc81e317a4cc02e97fd2b3feb062211a92d0bf3f2d128864335cc47cb1f5ad1b9f9030674914f4de6424f8c410a786776e3f45fb"

RPROVIDES:${PN} += "tukitd"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-service \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libtukit.so.8 \
libtukit8"

inherit rpm
