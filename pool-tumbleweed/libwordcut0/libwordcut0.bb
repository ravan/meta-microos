SUMMARY = "Thai word segmentation utility"
DESCRIPTION = "Thai word segmentation utility."
LICENSE = "BSD-3-Clause"

PV = "0.5.1b2"

RPM_NAME = "libwordcut0-0.5.1b2-207.9.aarch64.rpm"
RPM_HASH = "cb0d00f33d19cc41924989652b57445175cc0715133f593e79c8c4ab6935f657571b04e29100e8f46ce5295b21c54f3bf7c1a04c888212bd8ab70a94b6dd5aaa"

RPROVIDES:${PN} += "libwordcut.so.0 \
libwordcut0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
