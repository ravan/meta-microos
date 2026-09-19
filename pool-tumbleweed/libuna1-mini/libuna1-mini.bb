SUMMARY = "Library to support Unicode and ASCII (byte string) conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions."
LICENSE = "LGPL-3.0-or-later"

PV = "20260602"

RPM_NAME = "libuna1-mini-20260602-1.5.aarch64.rpm"
RPM_HASH = "077d93ed451d7f6dbcc640053b29238a34dbe128f37da9d2a01acdd7e0642223c4d65ba0b60f8a924acba805a0db5390c4e6d57dae937fc48b32e372faf1ad9b"

RPROVIDES:${PN} += "libuna.so.1 \
libuna1-mini"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
