SUMMARY = "A C++ base UPnP library, derived from Portable UPnP, a.k.a libupnp"
DESCRIPTION = "A C++ base UPnP library, derived from Portable UPnP, a.k.a libupnp"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libnpupnp13-6.3.0-1.3.aarch64.rpm"
RPM_HASH = "89835b7b814baa9ead80024d325d6822ef5bba7564f9d2c2de0b720663c30e947450b78bfd628914e59e68c7d419c8299b19c6f041e0afc869b82a65133caadf"

RPROVIDES:${PN} += "libnpupnp.so.13 \
libnpupnp13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libmicrohttpd.so.12 \
libstdc++.so.6"

inherit rpm
