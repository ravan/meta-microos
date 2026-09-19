SUMMARY = "OMEMO Encryption Library"
DESCRIPTION = "Python library for handling OMEMO encryption."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "python314-omemo-dr-1.2.0-1.6.aarch64.rpm"
RPM_HASH = "717c5e3c45494b27fa8e8ea0cead3d7d3d6ace2a9c4a90dae1c178600b6dc08f9639613c50d4d189d5114e70b8635150c91592282331ed70a1d5e83b979807b0"

RPROVIDES:${PN} += "python3.14dist-omemo-dr \
python314-omemo-dr \
python3dist-omemo-dr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3.14dist-cryptography \
python3.14dist-protobuf \
python314-cryptography \
python314-protobuf"

inherit rpm
