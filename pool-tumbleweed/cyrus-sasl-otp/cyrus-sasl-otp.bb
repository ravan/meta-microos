SUMMARY = "Plugin for the OTP SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-otp-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "1460c836acf69a1af8438d811d37becd61bc66b5eaf8f0013ec1d5926a62a5bd5df946a57410a9988adde21c8aec7126a9e1e3d2884555b9eaa46f8e8b2729c8"

RPROVIDES:${PN} += "cyrus-sasl-otp \
libotp.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
