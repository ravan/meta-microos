SUMMARY = "File activity monitoring tool"
DESCRIPTION = "Fnotifystat periodically dumps out the activity on files in the system. It can \
be used to identify rogue file activity and discover which processes are \
performing open/close/read/write operations on the files."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.06"

RPM_NAME = "fnotifystat-0.02.06-1.23.aarch64.rpm"
RPM_HASH = "a64baae220b46a0ca3c4d9c66797b2f883aa264358514fa58e39c9be35282ef7f6f78a97225770915a2e6e5f64aa9cea918f9cce81e2de5488697aa6a6d2571e"

RPROVIDES:${PN} += "fnotifystat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
