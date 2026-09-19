SUMMARY = "Replacement for 'buffer' with many more Features"
DESCRIPTION = "mbuffer is a raplacement for buffer with additional functionality: \
- display of I/O speed \
- optional use of memory mapped I/O for huge buffers \
- multithreaded instead of sharedmemory ipc \
- multi volume support \
- autoloader support \
- networking support \
- compatible command-line options"
LICENSE = "GPL-3.0-or-later"

PV = "20260511"

RPM_NAME = "mbuffer-20260511-1.3.aarch64.rpm"
RPM_HASH = "eb0147d980e71f356c2423391fc1844f89d189a0ff8003bebe7b3c3f589a28d02dda6cb249ff2f9443739e11ab81b7d53896193b38a3673c1ffd23c649ab796c"

RPROVIDES:${PN} += "mbuffer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
