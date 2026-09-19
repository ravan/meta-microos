SUMMARY = "Web Framework for REST Applications in C"
DESCRIPTION = "The library is based on GNU libmicrohttpd for the backend web server, jansson \
for the json manipulation library, and libcurl for the HTTP/SMTP client API. \
 \
It can be used to create web applications in C programs."
LICENSE = "MIT"

PV = "2.7.15"

RPM_NAME = "libulfius2_7-2.7.15-2.1.aarch64.rpm"
RPM_HASH = "a68de32c25b22d1685c3261eee86bc2d38e9a321c586414ec71fc8834afe1cf0e73afde1c8a29e4784ea66eaa6959872b5079089b8baaa68a9e9fc14c94668d1"

RPROVIDES:${PN} += "libulfius.so.2.7 \
libulfius2-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgnutls.so.30 \
libjansson.so.4 \
libmicrohttpd.so.12 \
liborcania.so.2.3 \
libyder.so.1.4 \
libz.so.1"

inherit rpm
