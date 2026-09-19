SUMMARY = "OMEMO Encryption Library"
DESCRIPTION = "Python library for handling OMEMO encryption."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "python313-omemo-dr-1.2.0-1.6.aarch64.rpm"
RPM_HASH = "f16e1344320a3fb9d1bd4d337d75d985434c6ec634d97156aa255362db629dc7ddc5dc72313cd2f2234d3ec68f7f449122f9c1e1126fd84eb919d45c8a17feaa"

RPROVIDES:${PN} += "python3-omemo-dr \
python3.13dist-omemo-dr \
python313-omemo-dr \
python3dist-omemo-dr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3.13dist-cryptography \
python3.13dist-protobuf \
python313-cryptography \
python313-protobuf"

inherit rpm
