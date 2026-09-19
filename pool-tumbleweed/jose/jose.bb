SUMMARY = "C-language implementation of Javascript Object Signing and Encryption"
DESCRIPTION = "José is a C-language implementation of the Javascript Object Signing and Encryption standards."
LICENSE = "Apache-2.0"

PV = "14"

RPM_NAME = "jose-14-1.3.aarch64.rpm"
RPM_HASH = "2e73d0c8d0a448cf0e7bed70c57867a984340f062b46ed766c5b83e2e67ba540f21ef63fb81ebc11b81315a05b3f42719a15c2f523fcc66247724335df59a2f7"

RPROVIDES:${PN} += "jose"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libjose.so.0"

inherit rpm
