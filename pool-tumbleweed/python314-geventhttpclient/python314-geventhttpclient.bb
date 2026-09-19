SUMMARY = "HTTP client library for gevent"
DESCRIPTION = "A concurrent HTTP client library for Python using gevent. \
 \
geventhttpclient uses a HTTP parser, written in C, originating from \
nginx, extracted and modified by Joyent. \
 \
geventhttpclient has been designed for high concurrency and \
streaming, and supports HTTP/1.1 persistent connections. More \
generally, it is designed for pulling from REST APIs and streaming \
APIs like Twitter's."
LICENSE = "MIT"

PV = "2.3.9"

RPM_NAME = "python314-geventhttpclient-2.3.9-1.4.aarch64.rpm"
RPM_HASH = "0ef2f090956c26f12a6fdd9e98c661acfdcbe50a718c5107c1f22d3f8014bb47e594f455669cb66f5c61500c55c78ad7602d045bfbe01d0307b21723347e2e52"

RPROVIDES:${PN} += "python3.14dist-geventhttpclient \
python314-geventhttpclient \
python3dist-geventhttpclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-Brotli \
python314-certifi \
python314-gevent \
python314-urllib3"

inherit rpm
