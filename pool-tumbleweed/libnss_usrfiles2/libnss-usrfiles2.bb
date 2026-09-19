SUMMARY = "NSS usrfiles plugin for glibc"
DESCRIPTION = "The NSS usrfiles plugin additionally looks in /usr/etc for passwd, \
group, rpc, services, protocols and more."
LICENSE = "LGPL-2.1-only"

PV = "2.27.1"

RPM_NAME = "libnss_usrfiles2-2.27.1-1.11.aarch64.rpm"
RPM_HASH = "70e6b65ccc4683bc689e4ac104f8e5d681d94ddc5585eebc33c47be5196281405b8da4549086448cb407952832354e72dd7f90dddf96b4acd3f34401d5dbe103"

RPROVIDES:${PN} += "libnss-usrfiles.so.2 \
libnss-usrfiles2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
