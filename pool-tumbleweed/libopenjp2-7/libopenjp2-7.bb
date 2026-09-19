SUMMARY = "Opensource JPEG 2000 Codec Implementation"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
It has been developed in order to promote the use of JPEG 2000, the new \
still-image compression standard from the Joint Photographic Experts Group \
(JPEG)."
LICENSE = "BSD-2-Clause"

PV = "2.5.4"

RPM_NAME = "libopenjp2-7-2.5.4-2.6.aarch64.rpm"
RPM_HASH = "807b54a3e65c8d4202a76447e69d0142e70716aaa82e0a0d0f5cc14b111b4a7e04454a4c9e4c9bc004b22ad4945428c341b06e9a83bcc2ff4068c1a2e7e2ef60"

RPROVIDES:${PN} += "libopenjp2-7 \
libopenjp2.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
