SUMMARY = "Pack Program"
DESCRIPTION = "Zoo is a packer based on the Lempel-Ziv algorithm. Lots of files on \
DOS/AmigaDOS and TOS systems used this packer for their archives. The \
compression rate of gzip is not reached, and thus zoo should only be used \
for decompressing old archives."
LICENSE = "SUSE-Public-Domain"

PV = "2.10.1"

RPM_NAME = "zoo-2.10.1-1.1.aarch64.rpm"
RPM_HASH = "d44fa081bd02f3fb1ce19ffe6e46649dbb4d710282090020d8c555b2aaef95ec77693b156e1e8f9d97ef8b276dea0e70e6532a811b11895dea50f8193daf10d7"

RPROVIDES:${PN} += "zoo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
