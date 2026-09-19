SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "libcelt0-2-0.11.3-2.5.aarch64.rpm"
RPM_HASH = "53c1cb45ac2cc09375826101e42e47ccaef8ea38e56cb6c5eba6a24f42d83b40e089591b1253a23c1651b7258383827012f01b9a11543ea6b1a1b3b74e758f89"

RPROVIDES:${PN} += "libcelt0-2 \
libcelt0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
