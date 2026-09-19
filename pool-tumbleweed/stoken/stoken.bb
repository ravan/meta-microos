SUMMARY = "Token code generator compatible with RSA SecurID 128-bit (AES) token"
DESCRIPTION = "Software Token for Linux/UNIX. It's a token code generator compatible with RSA \
SecurID 128-bit (AES) tokens. It is a hobbyist project, not affiliated with or \
endorsed by RSA Security. \
 \
This package contains the command line tool for stoken."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "0.93"

RPM_NAME = "stoken-0.93-1.12.aarch64.rpm"
RPM_HASH = "fc56add11c56ac89ccaa87c709d7d61885c29cac92284c690b54dc7f7eb83db4db6202c8e091095e50948d4be1bcd90c73e67106a72c0a022fb05b74d6b6b1e5"

RPROVIDES:${PN} += "stoken"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstoken.so.1"

inherit rpm
