SUMMARY = "Python 3 binding for libftdi1"
DESCRIPTION = "Library to program and control the FTDI USB controller. \
This library is used by many programs accessing FTDI USB-to-RS232 converters. \
 \
This package provides the python binding for libftdi."
LICENSE = "LGPL-2.1-only & GPL-2.0-only & GPL-2.0-with-classpath-exception"

PV = "1.6rc1.2+git.92d657b"

RPM_NAME = "python3-libftdi1-1.6rc1.2+git.92d657b-2.1.aarch64.rpm"
RPM_HASH = "1acabdb9b25121450c244eed1703f8dd7fedb04d2e2ce93486d381716c50de3065aa7bc3cf43383c2447d63a2f23f898ff11a60c4baa4c3ed8a642a6a157f14c"

RPROVIDES:${PN} += "python3-libftdi1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
python-abi"

inherit rpm
