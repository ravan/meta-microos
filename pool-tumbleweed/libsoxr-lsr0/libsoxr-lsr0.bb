SUMMARY = "Compatibility layer with libsamplerate"
DESCRIPTION = "soxr libsamplerate API compatibility layer (to some extent)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "libsoxr-lsr0-0.1.3-3.5.aarch64.rpm"
RPM_HASH = "ba8498c59ba628832229a944343932005fb1d8ef3ed3eb22f9535aa2333b2abd84d71fde570eb3faf0138ece3e4a4d789ca67f367b4bde315bfb452c36f3ef5d"

RPROVIDES:${PN} += "libsoxr-lsr.so.0 \
libsoxr-lsr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsoxr.so.0"

inherit rpm
