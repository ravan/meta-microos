SUMMARY = "Python extension for MurmurHash (MurmurHash3)"
DESCRIPTION = "Python extension for MurmurHash (MurmurHash3), a set of fast and robust hash functions."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "python314-mmh3-5.2.1-1.5.aarch64.rpm"
RPM_HASH = "cf7c6779cc9737736c6383ceebc62b376f7eb051d05db9757c352c26953278fb19421a30ebb352d81ed88eb4ad6a4e394854d5bde056cdf837ba761723fae01a"

RPROVIDES:${PN} += "python3.14dist-mmh3 \
python314-mmh3 \
python3dist-mmh3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
