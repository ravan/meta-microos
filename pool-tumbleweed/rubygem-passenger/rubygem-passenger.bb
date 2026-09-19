SUMMARY = "A fast and robust web server and application server for Ruby, Python"
DESCRIPTION = "A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use."
LICENSE = "GPL-2.0-only & MIT"

PV = "6.2.0"

RPM_NAME = "rubygem-passenger-6.2.0-1.1.aarch64.rpm"
RPM_HASH = "b08d3d501fd7cb144f8ef20c38ced86c311e039ab84e7f2bf31d57f930085f7d898ffb4871a600202476cfcbb4f768550915ea9026a2b5c57230c731ba3a268d"

RPROVIDES:${PN} += "config-rubygem-passenger \
rubygem-passenger"

RDEPENDS:${PN} += "/usr/bin/node \
/usr/bin/ruby \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
rubygem-passenger"

inherit rpm
