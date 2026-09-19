SUMMARY = "Library to support Unicode and ASCII (byte string) conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions."
LICENSE = "LGPL-3.0-or-later"

PV = "20260602"

RPM_NAME = "libuna1-20260602-1.7.aarch64.rpm"
RPM_HASH = "749d534b22a03d41b89914d836cb962dc2db2bc28943418c4187a48f02e435d542e74ae3cda0e3a9f7f8d74f80d031862b9d60e1e02c3a53a1d74a4515625741"

RPROVIDES:${PN} += "libuna.so.1 \
libuna1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
