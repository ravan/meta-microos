SUMMARY = "Deduplicating backup program with compression and authenticated encryption"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets."
LICENSE = "BSD-3-Clause"

PV = "1.4.5"

RPM_NAME = "borgbackup-1.4.5-1.1.aarch64.rpm"
RPM_HASH = "000e69b73325e91849425b9859756128c9f725eaceae75b5d5b8913a9c5dbf5c6501a61d7f0d950dc2815cd09c67204c38dbd5d5113a78665f04f8a75c201fd1"

RPROVIDES:${PN} += "borgbackup \
python3.13dist-borgbackup \
python3dist-borgbackup"

RDEPENDS:${PN} += "-python313-msgpack >= 1.0.3 with python313-msgpack <= 1.2.1 \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
libxxhash.so.0 \
libzstd.so.1 \
python-abi \
python313-packaging \
python313-pyfuse3"

inherit rpm
