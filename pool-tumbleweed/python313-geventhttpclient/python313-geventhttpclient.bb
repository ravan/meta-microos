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

RPM_NAME = "python313-geventhttpclient-2.3.9-1.4.aarch64.rpm"
RPM_HASH = "9193dc6ff895a0b735009fdc50530e1d07b9400f39887d44b62e89b0c39c5ae668d11e62960325eb83a7feb736400810ed844d4ac8a21865bf82c2350596c38c"

RPROVIDES:${PN} += "python3-geventhttpclient \
python3.13dist-geventhttpclient \
python313-geventhttpclient \
python3dist-geventhttpclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-Brotli \
python313-certifi \
python313-gevent \
python313-urllib3"

inherit rpm
