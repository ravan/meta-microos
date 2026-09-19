SUMMARY = "Library for HTTP normalizer and parser"
DESCRIPTION = "LibHTP is a security-aware parser for the HTTP protocol and the related bits \
and pieces. The goal of the project is mainly to support the Suricata use case. \
Other use cases might not fully be supported, and we encourage you to cover these."
LICENSE = "BSD-3-Clause"

PV = "0.5.53"

RPM_NAME = "libhtp2-0.5.53-1.1.aarch64.rpm"
RPM_HASH = "00dfaf759d91a175adc90e6fa3fd950b7d4d7c4538b917f0c4a8db8867f37b6ccbda31b8eaad4a5d7de5ed49236eeeac96417db905140706f4f14ae75c5025c6"

RPROVIDES:${PN} += "libhtp.so.2 \
libhtp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
