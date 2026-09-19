SUMMARY = "Base32 and base64 encoding library"
DESCRIPTION = "Library written in C for encoding and decoding data using base32 or base64 \
according to RFC-4648"
LICENSE = "Apache-2.0"

PV = "1.0.15"

RPM_NAME = "libbaseencode1-1.0.15-1.11.aarch64.rpm"
RPM_HASH = "567b4976e3f7afb4df4069fc4fdbbf6f39176f3faa884159735740a12aeb954992742bd78af53b70117552af8441e75b66e932034cfbf83348903ac4369ebcae"

RPROVIDES:${PN} += "libbaseencode.so.1 \
libbaseencode1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
