SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python313-frozenlist-1.8.0-2.6.aarch64.rpm"
RPM_HASH = "09ef1ad95b6eba242f3666c32599c0d1a45513060b05570568bb8ce2ffe4952e46bcd4aefb2ce51c7c58e83381c7d234de8d6a07c5cf870f26346528e177cc54"

RPROVIDES:${PN} += "python3-frozenlist \
python3.13dist-frozenlist \
python313-frozenlist \
python3dist-frozenlist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
