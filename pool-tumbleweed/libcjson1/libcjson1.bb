SUMMARY = "JSON parser library written in ANSI C"
DESCRIPTION = "A simple JSON parser library written in ANSI C."
LICENSE = "MIT"

PV = "1.7.19"

RPM_NAME = "libcjson1-1.7.19-3.2.aarch64.rpm"
RPM_HASH = "0a5cd3501b22d0d160a361db9b14186eefee06f0c2e34c153e36086ba7a2951d62eb0b6859b0110164b18f99e362a3c038db385209e155fe21638f03d1b06e28"

RPROVIDES:${PN} += "libcjson.so.1 \
libcjson1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
