SUMMARY = "Utility to extract information from vmcores"
DESCRIPTION = "Kdumpid extracts information such as type of dump, architecture \
and kernel version from raw vmcores (Kernel memory dumps)."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "kdumpid-1.7-3.5.aarch64.rpm"
RPM_HASH = "9f5b1a0b22e32e5163bf843a3736360f9331893fcda28ae14054ab6e41fbe5cf39b36b5d6cfa48793e34c1186b7792faf837af70713b5a1d404f88bde4dcc8f1"

RPROVIDES:${PN} += "kdumpid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.12 \
libsframe.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
