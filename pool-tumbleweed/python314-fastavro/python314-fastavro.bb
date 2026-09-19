SUMMARY = "Fast read/write of AVRO files"
DESCRIPTION = "Fast read/write of AVRO files"
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "python314-fastavro-1.12.2-1.3.aarch64.rpm"
RPM_HASH = "a0efc4bd5ba20e07796f1928badc4674765403522de8cfad5c9dd91895dee7c3171b8e8745633eb2a35a78cbf2b4d2d1e24a3eecad20a495eb3d7c2aa38ebac5"

RPROVIDES:${PN} += "python3.14dist-fastavro \
python314-fastavro \
python3dist-fastavro"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
