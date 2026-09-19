SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "libfrr0-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "32bc97a2d3fc564625dfc72c380b97943807737c3898b4883abc43be7598b5cce11573e6f3af117dc1e2624cc6a44d41db8a2ba30520a543e1339f4b5fef009d"

RPROVIDES:${PN} += "libfrr.so.0 \
libfrr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcap.so.2 \
libcrypt.so.1 \
libjson-c.so.5 \
libm.so.6 \
libpcre2-posix.so.3 \
libsqlite3.so.0 \
libunwind.so.8 \
libyang.so.3"

inherit rpm
