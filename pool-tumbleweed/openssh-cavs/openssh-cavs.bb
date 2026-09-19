SUMMARY = "OpenSSH FIPS crypto module CAVS tests"
DESCRIPTION = "This package contains the FIPS-140 CAVS (Cryptographic Algorithm \
Validation Program/Suite) related tests of OpenSSH."
LICENSE = "BSD-2-Clause & MIT"

PV = "10.5p1"

RPM_NAME = "openssh-cavs-10.5p1-1.2.aarch64.rpm"
RPM_HASH = "d289b0d5c3a9d3fe6ed0f1499d2a0b19a218918d6c6ecc6998896191f4b5c4e2151035f4e98d6ef0bceb4fc2a53c889a3a5056d5050909f1e3e199ea5727f772"

RPROVIDES:${PN} += "openssh-cavs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfido2.so.1 \
libz.so.1 \
openssh-common"

inherit rpm
