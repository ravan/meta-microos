SUMMARY = "A shared disk lock manager library"
DESCRIPTION = "The runtime libraries for sanlock, a shared disk lock manager. \
Hosts connected to a common SAN can use this to synchronize their \
access to the shared disks."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libsanlock1-5.1.0-2.3.aarch64.rpm"
RPM_HASH = "f0803ddddb318331e75a12bcfadc306c7b0611923ed905716928e1ae8ebc290081d78487edfe9421805b1da5e046b55fc724d067394bcdc51eba19a832dcc841"

RPROVIDES:${PN} += "libsanlock-client.so.1 \
libsanlock.so.1 \
libsanlock1 \
libwdmd.so.1 \
sanlock-lib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper.so.1.03"

inherit rpm
