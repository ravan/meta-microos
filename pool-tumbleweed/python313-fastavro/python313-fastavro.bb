SUMMARY = "Fast read/write of AVRO files"
DESCRIPTION = "Fast read/write of AVRO files"
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "python313-fastavro-1.12.2-1.3.aarch64.rpm"
RPM_HASH = "80ff2a5e4ab0fcab55c8a1e1f31764b734f0f344a3acca891828d1c7446b476c6f82d05161d2b2b450d03a0683451fb7d49989eef1f6ad4ace5125c93a9c3492"

RPROVIDES:${PN} += "python3-fastavro \
python3.13dist-fastavro \
python313-fastavro \
python3dist-fastavro"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
