SUMMARY = "Open Source Next Generation Intrusion Detection and Prevention Engine Library"
DESCRIPTION = "The Suricata Engine is an Open Source Next Generation Intrusion Detection and \
Prevention Engine. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-only"

PV = "8.0.6"

RPM_NAME = "libsuricata8_0_6-8.0.6-1.3.aarch64.rpm"
RPM_HASH = "a522a78ecd7f913c643561125f113301bbda13d32c7ab429a9c47ac481ecb853ac46c90ebd415389fedc50a81573f13e3a917b90e86b4ea42072b0d9fd83d63c"

RPROVIDES:${PN} += "libsuricata.so.8.0.6 \
libsuricata8-0-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
