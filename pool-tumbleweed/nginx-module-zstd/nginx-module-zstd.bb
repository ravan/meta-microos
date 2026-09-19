SUMMARY = "NGINX module for Zstandard compression"
DESCRIPTION = "This is a nginx module to enable Zstd (de)compression on HTTP streams. \
 \
Zstd, short for Zstandard, is a lossless compression algorithm. Speed \
vs. compression trade-off is configurable in small increments."
LICENSE = "BSD-2-Clause"

PV = "0.1.1"

RPM_NAME = "nginx-module-zstd-0.1.1-2.19.aarch64.rpm"
RPM_HASH = "3ac09ce0062de56d783427e62ff1fb2f9e46beed234d10b7b5b6ded5e2ef5121e31ddebe448085a10749b9ae5e8a10101b1c74001ff81d3e3faeee77db136b95"

RPROVIDES:${PN} += "nginx-module-zstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
nginx"

inherit rpm
