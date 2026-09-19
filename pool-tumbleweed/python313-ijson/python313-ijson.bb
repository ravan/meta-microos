SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "python313-ijson-3.5.1-1.2.aarch64.rpm"
RPM_HASH = "2e6a0daa79b3e4a9c8cd07bdfd618c26799f39722bfea5550557bbccbcf5a70abab5f63acdd7ad9f1aa321b9e0c1cd69b3742096df4808ec767b6a6758710a05"

RPROVIDES:${PN} += "python3-ijson \
python3.13dist-ijson \
python313-ijson \
python3dist-ijson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
