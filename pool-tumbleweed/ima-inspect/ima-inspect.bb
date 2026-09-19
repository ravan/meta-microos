SUMMARY = "Output IMA/EVM extended attributes in a human readable format"
DESCRIPTION = "This is a small utility that supplements ima-evm-utils with a way to inspect \
the security.ima and security.evm extended attributes in human readable \
format."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15"

RPM_NAME = "ima-inspect-0.15-1.12.aarch64.rpm"
RPM_HASH = "19bdb0f91370fecd03026e095ae39b83e7dac84d85b7e7a93806ce10d4306ef25e43cb880ea830f034072b9b99f1b94c246067c2bf512c662c906e2261004a5a"

RPROVIDES:${PN} += "ima-inspect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
