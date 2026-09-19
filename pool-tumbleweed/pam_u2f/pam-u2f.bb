SUMMARY = "U2F authentication integration into PAM"
DESCRIPTION = "The PAM U2F module provides a way to integrate the Yubikey \
(or other U2F-compliant authenticators) into the existing user \
authentication infrastructure."
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "pam_u2f-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "7652e6f8b5932d8825d4aef9b28c4f54c90fe9e0c37dcd84dc01f6f6110bd3cd0902b94e291cb7400082e526721bd6d0e0b32a964a346be77d340fa31d01315d"

RPROVIDES:${PN} += "pam-u2f"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfido2.so.1 \
libpam.so.0"

inherit rpm
