SUMMARY = "NGINX module for RTMP/HLS/DASH serving"
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "nginx-module-rtmp-1.2.2-1.9.aarch64.rpm"
RPM_HASH = "05033473f8ccc4a6a03f2cf72ab225103490a9a1ba1d86533a6521b6ac936c65163d7833469bfe21fa22807e22df66d6c92c9d134d3617b574436b71d85be758"

RPROVIDES:${PN} += "nginx-module-rtmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nginx"

inherit rpm
