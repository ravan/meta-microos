SUMMARY = "C++ logging library"
DESCRIPTION = "A header-only/compiled, C++ logging library. \
 \
* Asynchronous mode (optional) \
* Multi/Single threaded loggers. \
* Various log targets (rotating/daily files, console, with colors, \
  syslog, custom target)"
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libspdlog1_17-1.17.0-1.3.aarch64.rpm"
RPM_HASH = "227776227141cd317854886ecfcb409c6e10d92b63bc9077de6a140aeaea4f95df70160e402101d53f7230a9f7d7b229e79ede9e92b16f8b41a90d17b98fb2bf"

RPROVIDES:${PN} += "libspdlog.so.1.17 \
libspdlog1-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
