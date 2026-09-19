SUMMARY = "A Chess Program"
DESCRIPTION = "A smart chess playing program which uses opening book."
LICENSE = "GPL-2.0+"

PV = "25"

RPM_NAME = "phalanx-25-2.9.aarch64.rpm"
RPM_HASH = "a25450aa38ae51361f5986dae5a91db39f599ddb9c4dd57ad7709bf8aeeec0368f973af31ace8b12e088d49f6b3d0224b95b7d9f7fd2423e371e00419f721bf2"

RPROVIDES:${PN} += "chess-backend \
phalanx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
