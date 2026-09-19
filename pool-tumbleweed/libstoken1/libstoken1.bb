SUMMARY = "Libraries for stoken"
DESCRIPTION = "Software Token for Linux/UNIX. It's a token code generator compatible with RSA \
SecurID 128-bit (AES) tokens. It is a hobbyist project, not affiliated with or \
endorsed by RSA Security. \
 \
This package contains stoken libraries."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "0.93"

RPM_NAME = "libstoken1-0.93-1.12.aarch64.rpm"
RPM_HASH = "0569e7ec4e6bb63566ac09b628e4f4e1575407c5b3a8ea840c290514fc254d7b68253d0abafa5e471ec35aa3e9f4aaae8993fcee2bc49af5daed57040040b098"

RPROVIDES:${PN} += "libstoken.so.1 \
libstoken1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtomcrypt.so.1 \
libxml2.so.16"

inherit rpm
