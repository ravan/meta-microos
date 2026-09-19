SUMMARY = "Universal Binary JSON encoder/decoder"
DESCRIPTION = "This is a Python v3.2+ (and 2.7+) `Universal Binary JSON` \
encoder/decoder based on the `draft-12` specification."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python314-py-ubjson-0.16.1-2.7.aarch64.rpm"
RPM_HASH = "924369a61902174351914618a40e686cfdda35217b2efaca5ae43a69163e103a0a3db1768f01878a2e7c01568a982e6e4f498619f925f8b3ed3af5343810f5e0"

RPROVIDES:${PN} += "python3.14dist-py-ubjson \
python314-py-ubjson \
python3dist-py-ubjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
