SUMMARY = "An alternate Linux/POSIX capabilities library"
DESCRIPTION = "libcap-ng is a library providing an alternate mechanism to libcap to \
inspect and set Linux process and file capabilities (modeled upon a \
withdrawn POSIX.1e draft)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.5"

RPM_NAME = "libcap-ng0-0.8.5-1.10.aarch64.rpm"
RPM_HASH = "2606c41b749eb93b1c0ae0857d30812a407e2eb245bfac0b03c933c62542bbcc02253f68adf3c2a39e09c19c45bece4aa762024b0640f0ad7b239ce73fd44e08"

RPROVIDES:${PN} += "libcap-ng.so.0 \
libcap-ng0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
