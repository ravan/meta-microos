SUMMARY = "Converts Motorola and Intel hex files to binary"
DESCRIPTION = "Converts Motorola and Intel hex files to binary. For other formats, check this \
project also on sourceforge: srecord"
LICENSE = "BSD-2-Clause"

PV = "2.5"

RPM_NAME = "hex2bin-2.5-2.21.aarch64.rpm"
RPM_HASH = "8819ef39259fc6cb55d43e2dba85aa9376de644f3ee26ed1d1364826c9c305ed1665193cdaff0b92d798abecb486603f9ed321c0b98ff3b9e81010165d206750"

RPROVIDES:${PN} += "hex2bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
