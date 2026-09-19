SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "python314-ijson-3.5.1-1.2.aarch64.rpm"
RPM_HASH = "d082edc8629dfe3b77aa2e0f9d42617adc28f56b270fb3a913a031f9204d64a01c02f35e1a7c11f7d06d84729d73fb5a0f76bd3bc5d0b02b1ed44bd9788fce37"

RPROVIDES:${PN} += "python3.14dist-ijson \
python314-ijson \
python3dist-ijson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
