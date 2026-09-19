SUMMARY = "A D-Bus service which runs odd jobs on behalf of client applications"
DESCRIPTION = "oddjob is a D-Bus service which performs particular tasks for clients which \
connect to it and issue requests using the system-wide message bus."
LICENSE = "BSD-3-Clause"

PV = "0.34.7"

RPM_NAME = "oddjob-0.34.7-3.9.aarch64.rpm"
RPM_HASH = "8e8c6e3d4c217b3ec80f160aa5f44aa8df8f7995aa4f770ed6d7e613020a9774ed17b4dd3aa564849e46534bfd9668a4e3431c4c73238f50bcd496fab4e98c0f"

RPROVIDES:${PN} += "config-oddjob \
oddjob"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libselinux.so.1 \
libxml2.so.16 \
psmisc \
systemd"

inherit rpm
