SUMMARY = "Low-level library for Netfilter-related kernel/userspace communication"
DESCRIPTION = "libnfnetlink is the low-level library for netfilter related \
kernel/userspace communication. It provides a generic messaging \
infrastructure for in-kernel netfilter subsystems (such as \
nfnetlink_log, nfnetlink_queue, nfnetlink_conntrack) and their \
respective users and/or management tools in userspace."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnfnetlink0-1.0.2-1.17.aarch64.rpm"
RPM_HASH = "f1d876f6eee96646c56d2b8a4b03248b7013177ebf4c7a7b42b18944f524a0e457d784276b6913dd68a625e918561d7e94b58319c9a62dd4e4b69b824b51e1e7"

RPROVIDES:${PN} += "libnfnetlink.so.0 \
libnfnetlink0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
