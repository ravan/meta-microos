SUMMARY = "Library for identification using RSA Blind Signatures"
DESCRIPTION = "A library for user identification using RSA blind signatures."
LICENSE = "BSD-3-Clause"

PV = "0.8.6"

RPM_NAME = "libd0_blind_id0-0.8.6-1.11.aarch64.rpm"
RPM_HASH = "c567fb1ebe509ccc7e2df00bc0578f0e058a3f24e41c6e614a3a29ee452ad3d74e448489d9fbfc5710bb12196321597299bd7fc7417d38ac6e83fd1164689a3a"

RPROVIDES:${PN} += "libd0-blind-id.so.0 \
libd0-blind-id0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
