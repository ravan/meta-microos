SUMMARY = "A user and group account administration library"
DESCRIPTION = "The libuser library implements a standardized interface for manipulating and \
administering user and group accounts.  The library uses pluggable back-ends to \
interface to its data sources. \
 \
Sample applications modeled after those included with the shadow password suite \
are included."
LICENSE = "LGPL-2.0-or-later"

PV = "0.64"

RPM_NAME = "libuser-0.64-2.7.aarch64.rpm"
RPM_HASH = "1802de5fc3423633d0a221d5a96fcf1f861d50d988b4af2850bae9b6778ef451d1657571fb0aca0b358465a37796fd1a9ab0f5fd376355fb4e78afd14caf4a80"

RPROVIDES:${PN} += "config-libuser \
libuser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpam-misc.so.0 \
libpam.so.0 \
libpopt.so.0 \
libselinux.so.1 \
libuser.so.1"

inherit rpm
