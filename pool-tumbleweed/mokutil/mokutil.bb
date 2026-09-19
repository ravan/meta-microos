SUMMARY = "Tools for manipulating machine owner keys"
DESCRIPTION = "This program provides the means to enroll and erase the machine owner \
keys (MOK) stored in the database of shim."
LICENSE = "GPL-3.0-only"

PV = "0.7.2"

RPM_NAME = "mokutil-0.7.2-2.5.aarch64.rpm"
RPM_HASH = "52861bf35239a4ebf1ec34148a443f6bb6503264ae497e42006c020218e7b28aab680bb7ade2a13271667b86115a66a2dbd4458b1eaad29a2ee929830032e466"

RPROVIDES:${PN} += "mokutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libefivar.so.1 \
libkeyutils.so.1 \
openssl"

inherit rpm
