SUMMARY = "C-language implementation of Javascript Object Signing and Encryption"
DESCRIPTION = "José is a C-language implementation of the Javascript Object Signing and Encryption standards."
LICENSE = "Apache-2.0"

PV = "14"

RPM_NAME = "libjose0-14-1.3.aarch64.rpm"
RPM_HASH = "f3742a46f00a686b637f59606ed3e9ee8075b5a43f8de2dbba7ec23d9a4ab4ac66dc070e744d5298118c2cd50bd19f418c64479b45469cf8ed7c753260fa925e"

RPROVIDES:${PN} += "libjose.so.0 \
libjose0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjansson.so.4 \
libz.so.1"

inherit rpm
