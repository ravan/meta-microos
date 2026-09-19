SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python314-frozenlist-1.8.0-2.6.aarch64.rpm"
RPM_HASH = "6d70d2b2aabf17bb441619317b725f4d8ea549a5bc318679de62121100c56910f367db35fb0cc94b0a6eb77c5a3bbfcda97bfeaf44c9951616a6259714c21e41"

RPROVIDES:${PN} += "python3.14dist-frozenlist \
python314-frozenlist \
python3dist-frozenlist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
