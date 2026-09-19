SUMMARY = "Near Field Communication (NFC) utilities"
DESCRIPTION = "This package contains one utility for listing NFC devices and \
in-field tags or targets."
LICENSE = "GPL-3.0+"

PV = "0.3.2"

RPM_NAME = "nfcutils-0.3.2-5.39.aarch64.rpm"
RPM_HASH = "63878d2d4e3d1c64f2a0505ed04bada549845bc53dde0807485c98a55ea28fb7b77ec5208ae71cb78a0a6e7cbc105e722c3db8f36a021d3310dfb288c16ae9d6"

RPROVIDES:${PN} += "nfcutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfc.so.6"

inherit rpm
