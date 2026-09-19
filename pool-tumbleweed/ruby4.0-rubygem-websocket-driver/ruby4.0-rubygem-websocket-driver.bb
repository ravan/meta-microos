SUMMARY = "WebSocket protocol handler with pluggable I/O"
DESCRIPTION = "WebSocket protocol handler with pluggable I/O."
LICENSE = "Apache-2.0"

PV = "0.7.6"

RPM_NAME = "ruby4.0-rubygem-websocket-driver-0.7.6-1.16.aarch64.rpm"
RPM_HASH = "02372253fcb112ec06f093c6943749d61e7aaaab1258ca2f5f2aefa62caaf6098e9695c05ced853f01a2490d3114d053ebbcb2a220df1d51c2a20ca93fd59ca1"

RPROVIDES:${PN} += "ruby4.0-rubygem-websocket-driver \
rubygem-ruby-4.0.0-websocket-driver \
rubygem-ruby-4.0.0-websocket-driver-0 \
rubygem-ruby-4.0.0-websocket-driver-0.7 \
rubygem-ruby-4.0.0-websocket-driver-0.7.6 \
rubygem-websocket-driver"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-websocket-extensions"

inherit rpm
