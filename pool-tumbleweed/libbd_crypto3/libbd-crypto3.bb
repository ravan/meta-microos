SUMMARY = "The Crypto plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to LUKS-style encrypted devices."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_crypto3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "0b667c31515b8bf104364d1d285ed5bfabdded589835ca57810e161a4c36c86d7175320fb75dc87ec2c5a1d0548f1e646eba003cab2e3ec48133234fe9dbf213"

RPROVIDES:${PN} += "libbd-crypto.so.3 \
libbd-crypto3 \
libblockdev-crypto"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libblkid.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libglib-2.0.so.0 \
libkeyutils.so.1"

inherit rpm
