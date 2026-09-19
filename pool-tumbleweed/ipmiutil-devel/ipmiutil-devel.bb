SUMMARY = "Includes libraries and headers for the ipmiutil package"
DESCRIPTION = "The ipmiutil-devel package contains headers and libraries which are \
useful for building custom IPMI applications."
LICENSE = "BSD-3-Clause"

PV = "3.2.2"

RPM_NAME = "ipmiutil-devel-3.2.2-1.4.aarch64.rpm"
RPM_HASH = "bd4c5c81df0748157755d9b5a9e54a32a7f17194540be5ddb1f07d7d6d70e3119e1368b7c1a50557ba988c65e64005d96337fa752c68e3037b96ae6c47f8189a"

RPROVIDES:${PN} += "ipmiutil-devel \
libipmiutil.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ipmiutil \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
