SUMMARY = "The D-Bus responder of sssd"
DESCRIPTION = "D-Bus responder of sssd, called InfoPipe, which allows \
information from sssd to be transmitted over the system bus."
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-dbus-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "5ebcc7dc4c6ebd464c4ec5e65c37e14d25e61b8a5f1e2501bee14766739a420ea744d10da9779a3f0a9c1b0c7793ce5ce425d32ae5e51d4662eb0b8b1f89ecf5"

RPROVIDES:${PN} += "sssd-dbus"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdhash.so.1 \
libifp-iface.so \
libldb.so.2 \
libpopt.so.0 \
libselinux.so.1 \
libsss-cert.so \
libsss-child.so \
libsss-debug.so \
libsss-iface.so \
libsss-sbus.so \
libsss-util.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtdb.so.1 \
libtevent.so.0 \
sssd"

inherit rpm
