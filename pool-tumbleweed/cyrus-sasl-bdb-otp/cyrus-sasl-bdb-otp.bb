SUMMARY = "Plugin for the OTP SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-otp-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "f7256c76de9f56e1ebcecbfd4d262b423d76860e9cd44d59e8f0035146c82dd9876a7c33b9b6b3ba7ad191993017e392f890eb77473c721aae98129209bb66ba"

RPROVIDES:${PN} += "cyrus-sasl-bdb-otp \
libotp.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
