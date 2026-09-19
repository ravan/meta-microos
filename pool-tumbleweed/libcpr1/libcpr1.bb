SUMMARY = "libcurl wrapper with a python-requests inspired API"
DESCRIPTION = "C++ Requests is a wrapper around libcurl inspired by python-requests. \
Wrapped features include e.g. custom headers, various POST uploads, \
various authentication methods, support for timeouts, cookie support, \
and asynchronous requests."
LICENSE = "MIT"

PV = "1.14.2"

RPM_NAME = "libcpr1-1.14.2-1.2.aarch64.rpm"
RPM_HASH = "12f3b3e8b4da9d8b144338f420cac72628ce5343aa7abffad42cf4751729b5dc54ace2f442da87d269c47c27bca5536a5d18ecd3e0d680dc2952b3a479272de0"

RPROVIDES:${PN} += "libcpr.so.1 \
libcpr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
